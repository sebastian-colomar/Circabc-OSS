/**
 * AresBridge
 * AresBridge back-end services
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: DIGIT-ARESBRIDGE-SUPPORT@ec.europa.eu
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
/* tslint:disable:no-unused-variable member-ordering */

import { Inject, Injectable, Optional } from '@angular/core';
import {
  HttpClient,
  HttpHeaders,
  HttpParams,
  HttpResponse,
  HttpEvent,
  HttpParameterCodec,
} from '@angular/common/http';
import { CustomHttpParameterCodec } from '../encoder';
import { Observable } from 'rxjs';

import { StoreDocumentRequest } from '../model/models';
import { StoreDocumentResponse } from '../model/models';
import { UserAccessResponse } from '../model/models';

import { BASE_PATH, COLLECTION_FORMATS } from '../variables';
import { Configuration } from '../configuration';

@Injectable({
  providedIn: 'root',
})
export class AresBridgeService {
  protected basePath = 'https://webgate.ec.testa.eu/Ares/bridge/services/v1';
  public defaultHeaders = new HttpHeaders();
  public configuration = new Configuration();
  public encoder: HttpParameterCodec;

  constructor(
    protected httpClient: HttpClient,
    @Optional() @Inject(BASE_PATH) basePath: string,
    @Optional() configuration: Configuration
  ) {
    if (configuration) {
      this.configuration = configuration;
    }
    if (typeof this.configuration.basePath !== 'string') {
      if (typeof basePath !== 'string') {
        basePath = this.basePath;
      }
      this.configuration.basePath = basePath;
    }
    this.encoder = this.configuration.encoder || new CustomHttpParameterCodec();
  }

  /**
   * @param consumes string[] mime-types
   * @return true: consumes contains 'multipart/form-data', false: otherwise
   */
  private canConsumeForm(consumes: string[]): boolean {
    const form = 'multipart/form-data';
    for (const consume of consumes) {
      if (form === consume) {
        return true;
      }
    }
    return false;
  }

  private addToHttpParams(
    httpParams: HttpParams,
    value: any,
    key?: string
  ): HttpParams {
    if (typeof value === 'object' && value instanceof Date === false) {
      httpParams = this.addToHttpParamsRecursive(httpParams, value);
    } else {
      httpParams = this.addToHttpParamsRecursive(httpParams, value, key);
    }
    return httpParams;
  }

  private addToHttpParamsRecursive(
    httpParams: HttpParams,
    value?: any,
    key?: string
  ): HttpParams {
    if (value == null) {
      return httpParams;
    }

    if (typeof value === 'object') {
      if (Array.isArray(value)) {
        (value as any[]).forEach(
          (elem) =>
            (httpParams = this.addToHttpParamsRecursive(httpParams, elem, key))
        );
      } else if (value instanceof Date) {
        if (key != null) {
          httpParams = httpParams.append(
            key,
            (value as Date).toISOString().substr(0, 10)
          );
        } else {
          throw Error('key may not be null if value is Date');
        }
      } else {
        Object.keys(value).forEach(
          (k) =>
            (httpParams = this.addToHttpParamsRecursive(
              httpParams,
              value[k],
              key != null ? `${key}.${k}` : k
            ))
        );
      }
    } else if (key != null) {
      httpParams = httpParams.append(key, value);
    } else {
      throw Error('key may not be null if value is not object or array');
    }
    return httpParams;
  }

  /**
   * Verifies user access rights in AresBridge UI
   * Just like Ares, AresBridge is only accessible to a certain set of users. Users external to the EC (or other integrated institutions) do not have access to Ares(Bridge).\\ Also for e.g. intra-muros users access could be blocked.\\ This service allows to check the access rights for a given EU Login username. It\&#39;s also verified whether the user has the right to register a document.\\ In case of unsufficient access the DMO (Document Management Officer) needs to be consulted.
   * @param username EU Login username for which access must be checked.
   * @param date The date and time when the request is sent (and the authentication token is built) in RFC1123 format.\\ Used for authentication purposes.
   * @param xABDate Alternative to the &#x60;Date&#x60; header in case it would not be allowed to specify the &#x60;Date&#x60; header in the request.\\ Either &#x60;Date&#x60; or &#x60;X-AB-Date&#x60; must be provided but &#x60;Date&#x60; takes precedence.
   * @param xABClientVersion Optional HTTP header that a client library can populate to indicate the version of the library that\&#39;s being used. Useful for support purposes only.
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public hasUserAccess(
    username: string,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'body',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<UserAccessResponse>;
  public hasUserAccess(
    username: string,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'response',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<HttpResponse<UserAccessResponse>>;
  public hasUserAccess(
    username: string,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'events',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<HttpEvent<UserAccessResponse>>;
  public hasUserAccess(
    username: string,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe: any = 'body',
    reportProgress: boolean = false,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<any> {
    if (username === null || username === undefined) {
      throw new Error(
        'Required parameter username was null or undefined when calling hasUserAccess.'
      );
    }

    let headers = this.defaultHeaders;
    if (date !== undefined && date !== null) {
      headers = headers.set('Date', String(date));
    }
    if (xABDate !== undefined && xABDate !== null) {
      headers = headers.set('X-AB-Date', String(xABDate));
    }
    if (xABClientVersion !== undefined && xABClientVersion !== null) {
      headers = headers.set('X-AB-Client-Version', String(xABClientVersion));
    }

    // authentication (AresBridgeToken) required
    if (this.configuration.apiKeys) {
      const key: string | undefined =
        this.configuration.apiKeys['AresBridgeToken'] ||
        this.configuration.apiKeys['Authorization'];
      if (key) {
        headers = headers.set('Authorization', key);
      }
    }

    let httpHeaderAcceptSelected: string | undefined =
      options && options.httpHeaderAccept;
    if (httpHeaderAcceptSelected === undefined) {
      // to determine the Accept header
      const httpHeaderAccepts: string[] = ['application/json'];
      httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(
        httpHeaderAccepts
      );
    }
    if (httpHeaderAcceptSelected !== undefined) {
      headers = headers.set('Accept', httpHeaderAcceptSelected);
    }

    let responseType: 'text' | 'json' = 'json';
    if (
      httpHeaderAcceptSelected &&
      httpHeaderAcceptSelected.startsWith('text')
    ) {
      responseType = 'text';
    }

    return this.httpClient.get<UserAccessResponse>(
      `${this.configuration.basePath}/user/access/${encodeURIComponent(
        String(username)
      )}`,
      {
        responseType: <any>responseType,
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress,
      }
    );
  }

  /**
   * Store a document which needs to be saved/registered in Ares
   * Service which allows to send the document and attachment metadata, the attachment binary content and the AresBridge UI preferences to the AresBridge server
   * @param body
   * @param attachment The order of the attachment is important and MUST match the order of the attachments in the JSON. Basically attachment with sequence 1 must be the first attachment in this array.
   * @param date The date and time when the request is sent (and the authentication token is built) in RFC1123 format. Used for authentication purposes.
   * @param xABDate Alternative to the &#x60;Date&#x60; header in case it would not be allowed to specify the &#x60;Date&#x60; header in the request.\\ Either &#x60;Date&#x60; or &#x60;X-AB-Date&#x60; must be provided but &#x60;Date&#x60;takes precedence.
   * @param xABClientVersion Optional HTTP header that a client library can populate to indicate the version of the library that\&#39;s being used. Useful for support purposes only.
   * @param observe set whether or not to return the data Observable as the body, response or events. defaults to returning the body.
   * @param reportProgress flag to report request and response progress.
   */
  public storeDocument(
    body: StoreDocumentRequest,
    attachment: Array<Blob>,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'body',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<StoreDocumentResponse>;
  public storeDocument(
    body: StoreDocumentRequest,
    attachment: Array<Blob>,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'response',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<HttpResponse<StoreDocumentResponse>>;
  public storeDocument(
    body: StoreDocumentRequest,
    attachment: Array<Blob>,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe?: 'events',
    reportProgress?: boolean,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<HttpEvent<StoreDocumentResponse>>;
  public storeDocument(
    body: StoreDocumentRequest,
    attachment: Array<Blob>,
    date?: string,
    xABDate?: string,
    xABClientVersion?: string,
    observe: any = 'body',
    reportProgress: boolean = false,
    options?: { httpHeaderAccept?: 'application/json' }
  ): Observable<any> {
    if (body === null || body === undefined) {
      throw new Error(
        'Required parameter body was null or undefined when calling storeDocument.'
      );
    }
    if (attachment === null || attachment === undefined) {
      throw new Error(
        'Required parameter attachment was null or undefined when calling storeDocument.'
      );
    }

    let headers = this.defaultHeaders;
    if (date !== undefined && date !== null) {
      headers = headers.set('Date', String(date));
    }
    if (xABDate !== undefined && xABDate !== null) {
      headers = headers.set('X-AB-Date', String(xABDate));
    }
    if (xABClientVersion !== undefined && xABClientVersion !== null) {
      headers = headers.set('X-AB-Client-Version', String(xABClientVersion));
    }

    // authentication (AresBridgeToken) required
    if (this.configuration.apiKeys) {
      const key: string | undefined =
        this.configuration.apiKeys['AresBridgeToken'] ||
        this.configuration.apiKeys['Authorization'];
      if (key) {
        headers = headers.set('Authorization', key);
      }
    }

    let httpHeaderAcceptSelected: string | undefined =
      options && options.httpHeaderAccept;
    if (httpHeaderAcceptSelected === undefined) {
      // to determine the Accept header
      const httpHeaderAccepts: string[] = ['application/json'];
      httpHeaderAcceptSelected = this.configuration.selectHeaderAccept(
        httpHeaderAccepts
      );
    }
    if (httpHeaderAcceptSelected !== undefined) {
      headers = headers.set('Accept', httpHeaderAcceptSelected);
    }

    // to determine the Content-Type header
    const consumes: string[] = ['multipart/form-data'];

    const canConsumeForm = this.canConsumeForm(consumes);

    let formParams: { append(param: string, value: any): any };
    let useForm = false;
    let convertFormParamsToString = false;
    // use FormData to transmit files using content-type "multipart/form-data"
    // see https://stackoverflow.com/questions/4007969/application-x-www-form-urlencoded-or-multipart-form-data
    useForm = canConsumeForm;
    if (useForm) {
      formParams = new FormData();
    } else {
      formParams = new HttpParams({ encoder: this.encoder });
    }

    if (body !== undefined) {
      formParams =
        (formParams.append(
          'body',
          useForm
            ? new Blob([JSON.stringify(body)], { type: 'application/json' })
            : <any>body
        ) as any) || formParams;
    }
    if (attachment) {
      if (useForm) {
        attachment.forEach((element) => {
          formParams =
            (formParams.append('attachment', <any>element) as any) ||
            formParams;
        });
      } else {
        formParams =
          (formParams.append(
            'attachment',
            attachment.join(COLLECTION_FORMATS['csv'])
          ) as any) || formParams;
      }
    }

    let responseType: 'text' | 'json' = 'json';
    if (
      httpHeaderAcceptSelected &&
      httpHeaderAcceptSelected.startsWith('text')
    ) {
      responseType = 'text';
    }

    return this.httpClient.post<StoreDocumentResponse>(
      `${this.configuration.basePath}/document`,
      convertFormParamsToString ? formParams.toString() : formParams,
      {
        responseType: <any>responseType,
        withCredentials: this.configuration.withCredentials,
        headers: headers,
        observe: observe,
        reportProgress: reportProgress,
      }
    );
  }
}
