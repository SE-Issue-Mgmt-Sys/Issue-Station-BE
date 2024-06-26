# 이슈역(IssueStation) 웹 서비스 사용 설명서

이 문서는 이슈역(IssueStation) 웹 서비스를 사용하는 사용자를 위한 가이드입니다. 아래의 사용 시나리오를 따라 회원가입, 로그인, 프로젝트 생성, 이슈 관리 등의 기능을 활용할 수 있습니다.

## 목차
1. [About Us](#about-us)
2. [프로젝트 열람 (로그인하지 않은 상태)](#프로젝트-열람-로그인하지-않은-상태)
3. [회원가입](#회원가입)
4. [로그인](#로그인)
5. [로그아웃](#로그아웃)
6. [프로젝트 생성](#프로젝트-생성)
7. [My 프로젝트 확인](#my-프로젝트-확인)
8. [프로젝트 검색](#프로젝트-검색)
9. [프로젝트 역할 배정](#프로젝트-역할-배정)
10. [이슈 생성](#이슈-생성)
11. [이슈 삭제](#이슈-삭제)
12. [이슈 검색](#이슈-검색)
13. [개발자의 상태 변경 (Fixed)](#개발자의-상태-변경-fixed)
14. [Project Leader의 피드백 (Resolved)](#project-leader의-피드백-resolved)
---

## About Us

1. 이슈역 웹 페이지에 접속합니다: [이슈역 웹 페이지](http://issuestationweb.s3-website.ap-northeast-2.amazonaws.com/projectlist)
2. 상단 메뉴에서 **About Us**를 클릭합니다.
3. 이슈역 프로젝트에 참여한 개발자 프로필을 확인하고, 팀원들의 역할을 스크롤하여 확인합니다.

---

## 프로젝트 열람 (로그인하지 않은 상태)

1. **Home** 아래의 **Project**를 클릭합니다.
2. 현재 로그인하지 않은 상태임을 인지합니다.
3. Public 프로젝트를 열람할 수 있습니다.
4. Private 프로젝트는 열람할 수 없습니다.

---

## 회원가입

1. **Sign Up** 버튼을 클릭합니다.
2. ID 입력: `qwer`
    - 아이디 중복 확인을 진행합니다.
3. Password 입력: `qwer1004!`
4. Repeat Password 입력: `qwer1003!`
    - 비밀번호가 일치하지 않아 실패 메시지가 표시됩니다.
5. 닉네임 입력: `akaCpp`
    - 아이디 중복 확인 완료 후 회원가입 버튼이 비활성화됨을 인지합니다.
6. Repeat Password를 다시 입력: `qwer1004!`
    - 회원가입 버튼이 활성화되고 회원가입이 성공합니다.
7. 다시 회원가입 페이지에 접속하여 방금 전 가입한 아이디 및 닉네임의 중복확인을 진행합니다.

---

## 로그인

1. **Sign In** 페이지에서 방금 가입한 아이디와 비밀번호로 로그인을 진행합니다.
2. 로그인하지 않았을 때 열람이 불가능했던 프로젝트의 열람이 정상적으로 이루어짐을 확인합니다.

---

## 로그아웃

1. 상단 메뉴에서 **Logout** 버튼을 클릭합니다.
2. 로그아웃이 정상적으로 이루어지는지 확인합니다.

---

## 프로젝트 생성

1. 로그인 후, **Get started** 버튼을 클릭하여 프로젝트 생성 페이지로 이동합니다.
2. **Project Name**과 **Description**을 입력합니다.
3. Private 프로젝트 여부를 선택합니다 (체크/체크 해제).
4. 팀 멤버를 추가합니다 (예: `pl1`, `tester1`, `developer1`).
5. **프로젝트 생성** 버튼을 클릭하여 프로젝트를 생성합니다.

---

## My 프로젝트 확인

1. 로그인 한 후, **My Projects** 페이지에서 방금 생성한 프로젝트가 목록에 표시되는지 확인합니다.

---

## 프로젝트 검색

1. 검색창에 `QWER_P`를 입력하여 검색합니다.
    - `QWER_Private`와 `QWER_Public` 프로젝트가 검색되는 것을 확인합니다.
2. `QWER_Pu`를 검색하면 `QWER_Public`이 검색되고, `QWER_Pr`를 검색하면 `QWER_Private`이 검색되는 것을 확인합니다.
3. `테스트` 키워드로 검색하여 테스트용 프로젝트가 모두 검색되는 것을 확인합니다.

---

## 프로젝트 역할 배정

1. `test1` 계정으로 로그인하고 프로젝트에 접속합니다.
    - 역할이 PL이기 때문에 이슈 생성 버튼이 비활성화됨을 확인합니다.
2. `test2` 계정으로 로그인하고 프로젝트에 접속합니다.
    - 역할이 Tester이기 때문에 이슈 생성 버튼이 활성화됨을 확인합니다.

---

## 이슈 생성

1. Tester 역할의 계정으로 로그인 후 프로젝트에 접속합니다.
2. **Create Issue** 버튼을 클릭합니다.
3. 타이틀, 이슈 설명, 코멘트를 순서대로 작성하고, **완료** 버튼을 클릭하여 이슈를 생성합니다.

---

## 이슈 삭제

1. PL 계정으로 로그인 후, 프로젝트에 접속합니다.
2. Tester가 생성한 이슈를 선택합니다.
3. **Delete Issue** 버튼을 클릭하여 이슈를 삭제합니다.
4. 이슈가 정상적으로 삭제되었음을 확인합니다.

---

## 이슈 검색

1. 여러 개의 이슈를 생성한 후, 이슈 검색 기능을 테스트합니다.
2. 이름으로 이슈를 검색하고 결과를 확인합니다.
3. 상태(Status) 기준으로 이슈를 검색하고 결과를 확인합니다.

---

## 개발자의 상태 변경 (Fixed)

1. 할당받은 개발자 계정으로 로그인합니다.
2. 할당된 이슈를 선택하고 **Set Fixed** 버튼을 클릭하여 상태를 FIXED로 변경합니다.

---

## Project Leader의 피드백 (Resolved)

1. 이슈를 생성한 Tester 계정으로 로그인합니다.
2. **Set Resolved** 버튼을 클릭하여 상태를 RESOLVED로 변경합니다.

---

이 문서는 이슈역(IssueStation) 웹 서비스를 효율적으로 사용하는 데 도움이 되는 가이드입니다. 각 단계를 따라가며 프로젝트 관리 및 이슈 관리 기능을 활용해보세요.
