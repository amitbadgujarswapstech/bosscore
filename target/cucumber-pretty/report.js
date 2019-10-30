$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/account-transfer.feature");
formatter.feature({
  "line": 1,
  "name": "Account transfer",
  "description": "\r\nPayment module",
  "id": "account-transfer",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11323472100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "duration": 8785090900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 4358428200,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 4183082800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#And user clicks on Payment module"
    }
  ],
  "line": 12,
  "name": "Same currency transfer for same day delivery method.",
  "description": "",
  "id": "account-transfer;same-currency-transfer-for-same-day-delivery-method.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "user click on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount"
      ],
      "line": 14
    },
    {
      "cells": [
        "EUR Client account",
        "EUR Client account2",
        "Same Day Transfer",
        "400"
      ],
      "line": 15
    },
    {
      "cells": [
        "CAD client account",
        "CAD client account2",
        "Same Day Transfer",
        "300"
      ],
      "line": 16
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "user click on confirm transfer button",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user page redirect to Transfer confirmation screen",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user able to view the below details",
  "rows": [
    {
      "cells": [
        "Transaction Number",
        "From Account",
        "To Account",
        "Amount",
        "Transfer Date"
      ],
      "line": 20
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 21
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 22
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user click on Manage payment button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 64448900,
  "status": "passed"
});
formatter.before({
  "duration": 9408827300,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "duration": 10099074700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 4325214900,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 4171294400,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Different currency transfer for same day delivery method",
  "description": "",
  "id": "account-transfer;different-currency-transfer-for-same-day-delivery-method",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "user click on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount",
        "Transfer Equivalent"
      ],
      "line": 28
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Same Day Transfer",
        "400",
        "USD"
      ],
      "line": 29
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Same Day Transfer",
        "300",
        "USD"
      ],
      "line": 30
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Same Day Transfer",
        "400",
        "USD"
      ],
      "line": 31
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Same Day Transfer",
        "300",
        "USD"
      ],
      "line": 32
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Same Day Transfer",
        "400",
        "EUR"
      ],
      "line": 33
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Same Day Transfer",
        "300",
        "CAD"
      ],
      "line": 34
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Same Day Transfer",
        "400",
        "EUR"
      ],
      "line": 35
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Same Day Transfer",
        "300",
        "CAD"
      ],
      "line": 36
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user click on confirm transfer button",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user click on Get Rate button",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user click on accept button",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user page redirect to Transfer confirmation screen",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user able to view the below details",
  "rows": [
    {
      "cells": [
        "Transaction Number",
        "From Account",
        "To Account",
        "Amount",
        "Transfer Date"
      ],
      "line": 42
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 43
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 44
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "user click on Manage payment button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 72776000,
  "status": "passed"
});
formatter.before({
  "duration": 9416662900,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "duration": 8111469700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 4306224300,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 4165621600,
  "status": "passed"
});
formatter.scenario({
  "line": 48,
  "name": "Different currency transfer for Next day delivery method",
  "description": "",
  "id": "account-transfer;different-currency-transfer-for-next-day-delivery-method",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "user click on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount",
        "Transfer Equivalent"
      ],
      "line": 50
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Next Day Transfer",
        "400",
        "USD"
      ],
      "line": 51
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Next Day Transfer",
        "300",
        "USD"
      ],
      "line": 52
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Next Day Transfer",
        "400",
        "USD"
      ],
      "line": 53
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Next Day Transfer",
        "300",
        "USD"
      ],
      "line": 54
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Next Day Transfer",
        "400",
        "EUR"
      ],
      "line": 55
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Next Day Transfer",
        "300",
        "CAD"
      ],
      "line": 56
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Next Day Transfer",
        "400",
        "EUR"
      ],
      "line": 57
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Next Day Transfer",
        "300",
        "CAD"
      ],
      "line": 58
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "user click on confirm transfer button",
  "keyword": "And "
});
formatter.step({
  "line": 60,
  "name": "user click on Get Rate button",
  "keyword": "And "
});
formatter.step({
  "line": 61,
  "name": "user click on accept button",
  "keyword": "And "
});
formatter.step({
  "line": 62,
  "name": "user page redirect to Transfer confirmation screen",
  "keyword": "And "
});
formatter.step({
  "line": 63,
  "name": "user able to view the below details",
  "rows": [
    {
      "cells": [
        "Transaction Number",
        "From Account",
        "To Account",
        "Amount",
        "Transfer Date"
      ],
      "line": 64
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 65
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 66
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 67
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 68
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 69
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 70
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 71
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 72
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "user click on Manage payment button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 76898200,
  "status": "passed"
});
formatter.before({
  "duration": 9411768200,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "duration": 8748198600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 4310242100,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 4173153000,
  "status": "passed"
});
formatter.scenario({
  "line": 76,
  "name": "Different currency transfer for Spot transfer delivery method.",
  "description": "",
  "id": "account-transfer;different-currency-transfer-for-spot-transfer-delivery-method.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 75,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 77,
  "name": "user click on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount",
        "Transfer Equivalent"
      ],
      "line": 78
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Standard/Spot Transfer",
        "400",
        "USD"
      ],
      "line": 79
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Standard/Spot Transfer",
        "300",
        "USD"
      ],
      "line": 80
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Standard/Spot Transfer",
        "400",
        "USD"
      ],
      "line": 81
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Standard/Spot Transfer",
        "300",
        "USD"
      ],
      "line": 82
    },
    {
      "cells": [
        "EUR Client account",
        "DDA Account",
        "Standard/Spot Transfer",
        "400",
        "EUR"
      ],
      "line": 83
    },
    {
      "cells": [
        "CAD client account",
        "DDA Account",
        "Standard/Spot Transfer",
        "300",
        "CAD"
      ],
      "line": 84
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Standard/Spot Transfer",
        "400",
        "EUR"
      ],
      "line": 85
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Standard/Spot Transfer",
        "300",
        "CAD"
      ],
      "line": 86
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "user click on Get Rate button",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "user click on accept button",
  "keyword": "And "
});
formatter.step({
  "line": 89,
  "name": "user click on confirm transfer button",
  "keyword": "And "
});
formatter.step({
  "line": 90,
  "name": "user page redirect to Transfer confirmation screen",
  "keyword": "And "
});
formatter.step({
  "line": 91,
  "name": "user able to view the below details",
  "rows": [
    {
      "cells": [
        "Transaction Number",
        "From Account",
        "To Account",
        "Amount",
        "Transfer Date"
      ],
      "line": 92
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 93
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 94
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 95
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 96
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 97
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 98
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 99
    },
    {
      "cells": [
        "",
        "",
        "",
        "",
        ""
      ],
      "line": 100
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "user click on Manage payment button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 71547600,
  "status": "passed"
});
formatter.before({
  "duration": 15250122400,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom chrome not reachable\n  (Session info: chrome\u003d77.0.3865.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-KPODSOV\u0027, ip: \u0027192.168.0.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00B4EB13+1501971]\n\tOrdinal0 [0x00ACF6D1+980689]\n\tOrdinal0 [0x00A57508+488712]\n\tOrdinal0 [0x00A5131A+463642]\n\tOrdinal0 [0x00A519C8+465352]\n\tOrdinal0 [0x00A52AA5+469669]\n\tOrdinal0 [0x00A4EC85+453765]\n\tOrdinal0 [0x00A58330+492336]\n\tOrdinal0 [0x00A0A108+172296]\n\tOrdinal0 [0x00A0942D+169005]\n\tOrdinal0 [0x00A078EB+162027]\n\tOrdinal0 [0x009F0AC7+68295]\n\tOrdinal0 [0x009F1B40+72512]\n\tOrdinal0 [0x009F1AD9+72409]\n\tOrdinal0 [0x00AE8F37+1085239]\n\tGetHandleVerifier [0x00BED7ED+503293]\n\tGetHandleVerifier [0x00BED580+502672]\n\tGetHandleVerifier [0x00BF46AC+531644]\n\tGetHandleVerifier [0x00BEDFFA+505354]\n\tOrdinal0 [0x00AE0606+1050118]\n\tOrdinal0 [0x00AE047F+1049727]\n\tOrdinal0 [0x00AEAF9B+1093531]\n\tOrdinal0 [0x00AEB103+1093891]\n\tOrdinal0 [0x00AEA095+1089685]\n\tBaseThreadInitThunk [0x76A36359+25]\n\tRtlGetAppContainerNamedObjectPath [0x776D7B74+228]\n\tRtlGetAppContainerNamedObjectPath [0x776D7B44+180]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.boss.framework.BaseDrivers.startChrome(BaseDrivers.java:113)\r\n\tat com.boss.framework.BaseDrivers.beforeClass(BaseDrivers.java:80)\r\n\tat com.boss.stepdefinition.BeforeActions.setUp(BeforeActions.java:15)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 104,
  "name": "DDA to DDA account transfer",
  "description": "",
  "id": "account-transfer;dda-to-dda-account-transfer",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 103,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 105,
  "name": "user click on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account"
      ],
      "line": 106
    },
    {
      "cells": [
        "DDA account2",
        "DDA Account"
      ],
      "line": 107
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 108,
  "name": "System will display \"DDA to DDA Account transfer is not allowed\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 180600,
  "error_message": "java.lang.NullPointerException\r\n\tat com.boss.stepdefinition.AfterActions.teardown(AfterActions.java:24)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 15278998000,
  "error_message": "org.openqa.selenium.SessionNotCreatedException: session not created\nfrom chrome not reachable\n  (Session info: chrome\u003d77.0.3865.120)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-KPODSOV\u0027, ip: \u0027192.168.0.164\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_221\u0027\nDriver info: driver.version: ChromeDriver\nremote stacktrace: Backtrace:\n\tOrdinal0 [0x00B4EB13+1501971]\n\tOrdinal0 [0x00ACF6D1+980689]\n\tOrdinal0 [0x00A57508+488712]\n\tOrdinal0 [0x00A5131A+463642]\n\tOrdinal0 [0x00A519C8+465352]\n\tOrdinal0 [0x00A52AA5+469669]\n\tOrdinal0 [0x00A4EC85+453765]\n\tOrdinal0 [0x00A58330+492336]\n\tOrdinal0 [0x00A0A108+172296]\n\tOrdinal0 [0x00A0942D+169005]\n\tOrdinal0 [0x00A078EB+162027]\n\tOrdinal0 [0x009F0AC7+68295]\n\tOrdinal0 [0x009F1B40+72512]\n\tOrdinal0 [0x009F1AD9+72409]\n\tOrdinal0 [0x00AE8F37+1085239]\n\tGetHandleVerifier [0x00BED7ED+503293]\n\tGetHandleVerifier [0x00BED580+502672]\n\tGetHandleVerifier [0x00BF46AC+531644]\n\tGetHandleVerifier [0x00BEDFFA+505354]\n\tOrdinal0 [0x00AE0606+1050118]\n\tOrdinal0 [0x00AE047F+1049727]\n\tOrdinal0 [0x00AEAF9B+1093531]\n\tOrdinal0 [0x00AEB103+1093891]\n\tOrdinal0 [0x00AEA095+1089685]\n\tBaseThreadInitThunk [0x76A36359+25]\n\tRtlGetAppContainerNamedObjectPath [0x776D7B74+228]\n\tRtlGetAppContainerNamedObjectPath [0x776D7B44+180]\n\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.W3CHandshakeResponse.lambda$errorHandler$0(W3CHandshakeResponse.java:62)\r\n\tat org.openqa.selenium.remote.HandshakeResponse.lambda$getResponseFunction$0(HandshakeResponse.java:30)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.lambda$createSession$0(ProtocolHandshake.java:126)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.tryAdvance(Spliterators.java:958)\r\n\tat java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:126)\r\n\tat java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:499)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:486)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.FindOps$FindOp.evaluateSequential(FindOps.java:152)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.findFirst(ReferencePipeline.java:464)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:128)\r\n\tat org.openqa.selenium.remote.ProtocolHandshake.createSession(ProtocolHandshake.java:74)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:136)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.startSession(RemoteWebDriver.java:213)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.\u003cinit\u003e(RemoteWebDriver.java:131)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:181)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:168)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:123)\r\n\tat com.boss.framework.BaseDrivers.startChrome(BaseDrivers.java:113)\r\n\tat com.boss.framework.BaseDrivers.beforeClass(BaseDrivers.java:80)\r\n\tat com.boss.stepdefinition.BeforeActions.setUp(BeforeActions.java:15)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:202)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:40)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 112,
  "name": "MCA balance validation for same currency",
  "description": "",
  "id": "account-transfer;mca-balance-validation-for-same-currency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 111,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 113,
  "name": "EUR Client account available balance is EUR 1000",
  "keyword": "Given "
});
formatter.step({
  "line": 114,
  "name": "CAD Client account available balance is CAD 1000",
  "keyword": "Given "
});
formatter.step({
  "line": 115,
  "name": "user clicks on account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount"
      ],
      "line": 116
    },
    {
      "cells": [
        "EUR Client account",
        "EUR Client account2",
        "Same Day Transfer",
        "1000.01"
      ],
      "line": 117
    },
    {
      "cells": [
        "CAD client account",
        "CAD client account2",
        "Same Day Transfer",
        "1000.01"
      ],
      "line": 118
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "user clicks on transfer payment button",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "system will display the error message as \"Your account does not have sufficient funds for this transaction.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 190800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.boss.stepdefinition.AfterActions.teardown(AfterActions.java:24)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat cucumber.runtime.Utils$1.call(Utils.java:40)\r\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:16)\r\n\tat cucumber.runtime.Utils.invoke(Utils.java:34)\r\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:60)\r\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:224)\r\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:212)\r\n\tat cucumber.runtime.Runtime.runAfterHooks(Runtime.java:206)\r\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:46)\r\n\tat cucumber.runtime.model.CucumberFeature.run(CucumberFeature.java:165)\r\n\tat cucumber.api.testng.TestNGCucumberRunner.runCucumber(TestNGCucumberRunner.java:63)\r\n\tat cucumber.api.testng.AbstractTestNGCucumberTests.feature(AbstractTestNGCucumberTests.java:21)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.testng.internal.MethodInvocationHelper.invokeMethod(MethodInvocationHelper.java:104)\r\n\tat org.testng.internal.Invoker.invokeMethod(Invoker.java:645)\r\n\tat org.testng.internal.Invoker.invokeTestMethod(Invoker.java:851)\r\n\tat org.testng.internal.Invoker.invokeTestMethods(Invoker.java:1177)\r\n\tat org.testng.internal.TestMethodWorker.invokeTestMethods(TestMethodWorker.java:129)\r\n\tat org.testng.internal.TestMethodWorker.run(TestMethodWorker.java:112)\r\n\tat java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)\r\n\tat java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)\r\n\tat java.lang.Thread.run(Thread.java:748)\r\n",
  "status": "failed"
});
formatter.before({
  "duration": 9405097100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I launch the application \"Boss URL\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "user enters username \"Testuser1\" and password \"Password@1\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on Login Button",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "Boss URL",
      "offset": 26
    }
  ],
  "location": "Account_Transfer_stepDefination.I_launch_the_application(String)"
});
formatter.result({
  "duration": 11158163400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Testuser1",
      "offset": 22
    },
    {
      "val": "Password@1",
      "offset": 47
    }
  ],
  "location": "Login_stepDefinition.user_enters_username_and_password(String,String)"
});
formatter.result({
  "duration": 4322789300,
  "status": "passed"
});
formatter.match({
  "location": "Login_stepDefinition.user_clicks_on_Login_Button()"
});
formatter.result({
  "duration": 4167552600,
  "status": "passed"
});
formatter.scenario({
  "line": 123,
  "name": "DDA balance validation for different currency",
  "description": "",
  "id": "account-transfer;dda-balance-validation-for-different-currency",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 122,
      "name": "@ORPHAN"
    }
  ]
});
formatter.step({
  "line": 124,
  "name": "DDA account available balance is USD 1000",
  "keyword": "Given "
});
formatter.step({
  "line": 125,
  "name": "user clicks on Account transfer sub-module",
  "rows": [
    {
      "cells": [
        "From Account",
        "To Account",
        "Delivery Method",
        "Amount",
        "Transfer Equivalent"
      ],
      "line": 126
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Same Day Transfer",
        "1000.01",
        "USD"
      ],
      "line": 127
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Same Day Transfer",
        "1000.01",
        "USD"
      ],
      "line": 128
    },
    {
      "cells": [
        "DDA Account",
        "EUR Client account",
        "Same Day Transfer",
        "900",
        "EUR"
      ],
      "line": 129
    },
    {
      "cells": [
        "DDA Account",
        "CAD client account",
        "Same Day Transfer",
        "9000",
        "CAD"
      ],
      "line": 130
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "user click on Get Rate button",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "system will display the error message as \"Your account does not have sufficient funds for this transaction.\"",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "duration": 79897900,
  "status": "passed"
});
