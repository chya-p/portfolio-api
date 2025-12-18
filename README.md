# Portfolio API

## Project Overview
This project is a movie management API built with Java 17 and Spring Boot 3.4.12, using MySQL 8.4.7 for the database.
It allows users to create, read, update, and delete movie records via RESTful API endpoints.

## Technology Stack
- Java 17 / Spring Boot 3.4.12
- MySQL 8.4.7
- Maven for build management
- Postman for API testing
- Git / GitHub for version control

## API Endpoints
| Method | Endpoint      | Description |
|--------|--------------|-------------|
| GET    | /films       | Retrieve all movies |
| GET    | /films/{id}  | Retrieve a movie by ID |
| POST   | /films       | Create a new movie |
| PUT    | /films/{id}  | Update a movie |
| DELETE | /films/{id}  | Delete a movie |

## Key Implementation Points
- JPA / Hibernate manages database operations
- @GeneratedValue(strategy = GenerationType.IDENTITY) used for auto-increment primary key
- RESTful API design following CRUD principles
- Verified all operations with Postman
- Screenshots of each operation included for demonstration

## How to Run
1. Clone the repository
```bash
git clone https://github.com/USERNAME/portfolio-api.git
```
2. Navigate to the project directory
```bash
cd portfolio-api

```
3. Run using Maven
```bash
./mvnw spring-boot:run

```
4. Access API via Postman or browser


---

# README 日本語版

# ポートフォリオ API

## プロジェクト概要
本プロジェクトは、Java 17 と Spring Boot 3.4.12 を使用し、MySQL 8.4.7 をデータベースとして構築した映画情報管理 API です。
RESTful API エンドポイントを通じて、映画データの登録、取得、更新、削除が可能です。

## 使用技術
- Java 17 / Spring Boot 3.4.12
- MySQL 8.4.7
- Maven（ビルド管理）
- Postman（API 動作確認）
- Git / GitHub（バージョン管理）

## API エンドポイント
| メソッド | エンドポイント | 説明 |
|----------|---------------|------|
| GET      | /films        | 映画データ全件取得 |
| GET      | /films/{id}   | ID で取得 |
| POST     | /films        | 新規作成 |
| PUT      | /films/{id}   | 更新 |
| DELETE  | /films/{id}   | 削除 |

## 実装のポイント
- JPA / Hibernate でデータベース操作を管理
- @GeneratedValue(strategy = GenerationType.IDENTITY) で主キー自動生成
- CRUD 原則に基づく RESTful API 設計
- Postman で CRUD 操作を確認済み
- 各操作のスクリーンショットを添付済み

## 実行方法
1. リポジトリをクローン
```bash
git clone https://github.com/USERNAME/portfolio-api.git
```
2. プロジェクトフォルダへ移動
```bash
cd portfolio-api
```
3. Maven で実行
```bash
./mvnw spring-boot:run

```
4. Postman またはブラウザで API にアクセス

---