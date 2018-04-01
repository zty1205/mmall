/**
 * Created by CJ on 2017/12/27.
 */
webpackJsonp([14], {
    0: function (t, e, r) {
        t.exports = r(61)
    }, 1: function (t, e, r) {
        "use strict";
        var n = r(4);
        const i = {serverHost: "", imageHost: "http://img.happymmall.com/"};
        var s = {
            request: function (t) {
                var e = this, r = t.forceLogin || !0;
                $.ajax({
                    type: t.method || "get",
                    url: t.url || "",
                    dataType: t.type || "json",
                    data: t.data || "",
                    success: function (n) {
                        0 === n.status ? "function" == typeof t.success && t.success(n.data, n.msg) : 10 === n.status && r ? e.doLogin() : 10 !== n.status || t.forceLogin ? "function" == typeof t.error && t.error(n.msg || n.data) : "function" == typeof t.error && t.error(n.msg || n.msg)
                    },
                    error: function (e) {
                        "function" == typeof t.error && t.error(e.statusText)
                    }
                })
            }, getServerUrl: function (t) {
                return i.serverHost + t
            }, getImageUrl: function (t) {
                return i.imageHost + t
            }, getUrlParam: function (t) {
                var e = new RegExp("(^|&)" + t + "=([^&]*)(&|$)"), r = window.location.search.substr(1).match(e);
                return r ? decodeURIComponent(r[2]) : null
            }, renderHtml: function (t, e) {
                var r = n.compile(t), i = r.render(e);
                return i
            }, successTips: function (t) {
                alert(t || "操作成功！")
            }, errorTips: function (t) {
                alert(t || "哪里不对了~")
            }, validate: function (t, e) {
                var t = $.trim(t);
                return "require" == e ? !!t : "phone" == e ? /^1\d{10}$/.test(t) : "email" == e ? /^[A-Za-z0-9\u4e00-\u9fa5]+@[A-Za-z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/.test(t) : void 0
            }, doLogin: function () {
                window.location.href = "login.html?redirect=" + encodeURIComponent(window.location.href)
            }
        };
        t.exports = s
    }, 2: function (t, e, r) {
        "use strict";
        var n = r(1), i = {
            checkUsername: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/check_valid.do"),
                    method: "POST",
                    data: {str: t, type: "username"},
                    success: e,
                    error: r
                })
            }, register: function (t, e, r) {
                n.request({url: n.getServerUrl("/user/register.do"), method: "POST", data: t, success: e, error: r})
            }, login: function (t, e, r) {
                n.request({url: n.getServerUrl("/user/login.do"), method: "POST", data: t, success: e, error: r})
            }, logout: function (t, e) {
                n.request({url: n.getServerUrl("/user/logout.do"), method: "POST", success: t, error: e})
            }, checkLogin: function (t, e) {
                n.request({url: n.getServerUrl("/user/get_user_info.do"), method: "POST", success: t, error: e})
            }, getQuestion: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/forget_get_question.do"),
                    method: "POST",
                    data: {username: t},
                    success: e,
                    error: r
                })
            }, checkAnswer: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/forget_check_answer.do"),
                    method: "POST",
                    data: t,
                    success: e,
                    error: r
                })
            }, resetPassword: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/forget_reset_password.do"),
                    method: "POST",
                    data: t,
                    success: e,
                    error: r
                })
            }, updatePassword: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/reset_password.do"),
                    method: "POST",
                    data: t,
                    success: e,
                    error: r
                })
            }, getUserInfo: function (t, e) {
                n.request({url: n.getServerUrl("/user/get_information.do"), method: "POST", success: t, error: e})
            }, updateUserInfo: function (t, e, r) {
                n.request({
                    url: n.getServerUrl("/user/update_information.do"),
                    method: "POST",
                    data: t,
                    success: e,
                    error: r
                })
            }
        };
        t.exports = i
    }, 3: function (t, e, r) {
        !function (t) {
            function e(t) {
                "}" === t.n.substr(t.n.length - 1) && (t.n = t.n.substring(0, t.n.length - 1))
            }

            function r(t) {
                return t.trim ? t.trim() : t.replace(/^\s*|\s*$/g, "")
            }

            function n(t, e, r) {
                if (e.charAt(r) != t.charAt(0))return !1;
                for (var n = 1, i = t.length; n < i; n++)if (e.charAt(r + n) != t.charAt(n))return !1;
                return !0
            }

            function i(e, r, n, a) {
                var u = [], c = null, l = null, f = null;
                for (l = n[n.length - 1]; e.length > 0;) {
                    if (f = e.shift(), l && "<" == l.tag && !(f.tag in T))throw new Error("Illegal content in < super tag.");
                    if (t.tags[f.tag] <= t.tags.$ || s(f, a))n.push(f), f.nodes = i(e, f.tag, n, a); else {
                        if ("/" == f.tag) {
                            if (0 === n.length)throw new Error("Closing tag without opener: /" + f.n);
                            if (c = n.pop(), f.n != c.n && !o(f.n, c.n, a))throw new Error("Nesting error: " + c.n + " vs. " + f.n);
                            return c.end = f.i, u
                        }
                        "\n" == f.tag && (f.last = 0 == e.length || "\n" == e[0].tag)
                    }
                    u.push(f)
                }
                if (n.length > 0)throw new Error("missing closing tag: " + n.pop().n);
                return u
            }

            function s(t, e) {
                for (var r = 0, n = e.length; r < n; r++)if (e[r].o == t.n)return t.tag = "#", !0
            }

            function o(t, e, r) {
                for (var n = 0, i = r.length; n < i; n++)if (r[n].c == t && r[n].o == e)return !0
            }

            function a(t) {
                var e = [];
                for (var r in t)e.push('"' + c(r) + '": function(c,p,t,i) {' + t[r] + "}");
                return "{ " + e.join(",") + " }"
            }

            function u(t) {
                var e = [];
                for (var r in t.partials)e.push('"' + c(r) + '":{name:"' + c(t.partials[r].name) + '", ' + u(t.partials[r]) + "}");
                return "partials: {" + e.join(",") + "}, subs: " + a(t.subs)
            }

            function c(t) {
                return t.replace(b, "\\\\").replace(d, '\\"').replace(v, "\\n").replace(m, "\\r").replace(w, "\\u2028").replace(S, "\\u2029")
            }

            function l(t) {
                return ~t.indexOf(".") ? "d" : "f"
            }

            function f(t, e) {
                var r = "<" + (e.prefix || ""), n = r + t.n + k++;
                return e.partials[n] = {
                    name: t.n,
                    partials: {}
                }, e.code += 't.b(t.rp("' + c(n) + '",c,p,"' + (t.indent || "") + '"));', n
            }

            function h(t, e) {
                e.code += "t.b(t.t(t." + l(t.n) + '("' + c(t.n) + '",c,p,0)));'
            }

            function p(t) {
                return "t.b(" + t + ");"
            }

            var g = /\S/, d = /\"/g, v = /\n/g, m = /\r/g, b = /\\/g, w = /\u2028/, S = /\u2029/;
            t.tags = {
                "#": 1,
                "^": 2,
                "<": 3,
                $: 4,
                "/": 5,
                "!": 6,
                ">": 7,
                "=": 8,
                _v: 9,
                "{": 10,
                "&": 11,
                _t: 12
            }, t.scan = function (i, s) {
                function o() {
                    b.length > 0 && (w.push({tag: "_t", text: new String(b)}), b = "")
                }

                function a() {
                    for (var e = !0, r = k; r < w.length; r++)if (e = t.tags[w[r].tag] < t.tags._v || "_t" == w[r].tag && null === w[r].text.match(g), !e)return !1;
                    return e
                }

                function u(t, e) {
                    if (o(), t && a())for (var r, n = k; n < w.length; n++)w[n].text && ((r = w[n + 1]) && ">" == r.tag && (r.indent = w[n].text.toString()), w.splice(n, 1)); else e || w.push({tag: "\n"});
                    S = !1, k = w.length
                }

                function c(t, e) {
                    var n = "=" + y, i = t.indexOf(n, e), s = r(t.substring(t.indexOf("=", e) + 1, i)).split(" ");
                    return x = s[0], y = s[s.length - 1], i + n.length - 1
                }

                var l = i.length, f = 0, h = 1, p = 2, d = f, v = null, m = null, b = "", w = [], S = !1, T = 0, k = 0, x = "{{", y = "}}";
                for (s && (s = s.split(" "), x = s[0], y = s[1]), T = 0; T < l; T++)d == f ? n(x, i, T) ? (--T, o(), d = h) : "\n" == i.charAt(T) ? u(S) : b += i.charAt(T) : d == h ? (T += x.length - 1, m = t.tags[i.charAt(T + 1)], v = m ? i.charAt(T + 1) : "_v", "=" == v ? (T = c(i, T), d = f) : (m && T++, d = p), S = T) : n(y, i, T) ? (w.push({
                    tag: v,
                    n: r(b),
                    otag: x,
                    ctag: y,
                    i: "/" == v ? S - x.length : T + y.length
                }), b = "", T += y.length - 1, d = f, "{" == v && ("}}" == y ? T++ : e(w[w.length - 1]))) : b += i.charAt(T);
                return u(S, !0), w
            };
            var T = {_t: !0, "\n": !0, $: !0, "/": !0};
            t.stringify = function (e, r, n) {
                return "{code: function (c,p,i) { " + t.wrapMain(e.code) + " }," + u(e) + "}"
            };
            var k = 0;
            t.generate = function (e, r, n) {
                k = 0;
                var i = {code: "", subs: {}, partials: {}};
                return t.walk(e, i), n.asString ? this.stringify(i, r, n) : this.makeTemplate(i, r, n)
            }, t.wrapMain = function (t) {
                return 'var t=this;t.b(i=i||"");' + t + "return t.fl();"
            }, t.template = t.Template, t.makeTemplate = function (t, e, r) {
                var n = this.makePartials(t);
                return n.code = new Function("c", "p", "i", this.wrapMain(t.code)), new this.template(n, e, this, r)
            }, t.makePartials = function (t) {
                var e, r = {subs: {}, partials: t.partials, name: t.name};
                for (e in r.partials)r.partials[e] = this.makePartials(r.partials[e]);
                for (e in t.subs)r.subs[e] = new Function("c", "p", "t", "i", t.subs[e]);
                return r
            }, t.codegen = {
                "#": function (e, r) {
                    r.code += "if(t.s(t." + l(e.n) + '("' + c(e.n) + '",c,p,1),c,p,0,' + e.i + "," + e.end + ',"' + e.otag + " " + e.ctag + '")){t.rs(c,p,function(c,p,t){', t.walk(e.nodes, r), r.code += "});c.pop();}"
                }, "^": function (e, r) {
                    r.code += "if(!t.s(t." + l(e.n) + '("' + c(e.n) + '",c,p,1),c,p,1,0,0,"")){', t.walk(e.nodes, r), r.code += "};"
                }, ">": f, "<": function (e, r) {
                    var n = {partials: {}, code: "", subs: {}, inPartial: !0};
                    t.walk(e.nodes, n);
                    var i = r.partials[f(e, r)];
                    i.subs = n.subs, i.partials = n.partials
                }, $: function (e, r) {
                    var n = {subs: {}, code: "", partials: r.partials, prefix: e.n};
                    t.walk(e.nodes, n), r.subs[e.n] = n.code, r.inPartial || (r.code += 't.sub("' + c(e.n) + '",c,p,i);')
                }, "\n": function (t, e) {
                    e.code += p('"\\n"' + (t.last ? "" : " + i"))
                }, _v: function (t, e) {
                    e.code += "t.b(t.v(t." + l(t.n) + '("' + c(t.n) + '",c,p,0)));'
                }, _t: function (t, e) {
                    e.code += p('"' + c(t.text) + '"')
                }, "{": h, "&": h
            }, t.walk = function (e, r) {
                for (var n, i = 0, s = e.length; i < s; i++)n = t.codegen[e[i].tag], n && n(e[i], r);
                return r
            }, t.parse = function (t, e, r) {
                return r = r || {}, i(t, "", [], r.sectionTags || [])
            }, t.cache = {}, t.cacheKey = function (t, e) {
                return [t, !!e.asString, !!e.disableLambda, e.delimiters, !!e.modelGet].join("||")
            }, t.compile = function (e, r) {
                r = r || {};
                var n = t.cacheKey(e, r), i = this.cache[n];
                if (i) {
                    var s = i.partials;
                    for (var o in s)delete s[o].instance;
                    return i
                }
                return i = this.generate(this.parse(this.scan(e, r.delimiters), e, r), e, r), this.cache[n] = i
            }
        }(e)
    }, 4: function (t, e, r) {
        var n = r(3);
        n.Template = r(5).Template, n.template = n.Template, t.exports = n
    }, 5: function (t, e, r) {
        !function (t) {
            function e(t, e, r) {
                var n;
                return e && "object" == typeof e && (void 0 !== e[t] ? n = e[t] : r && e.get && "function" == typeof e.get && (n = e.get(t))), n
            }

            function r(t, e, r, n, i, s) {
                function o() {
                }

                function a() {
                }

                o.prototype = t, a.prototype = t.subs;
                var u, c = new o;
                c.subs = new a, c.subsText = {}, c.buf = "", n = n || {}, c.stackSubs = n, c.subsText = s;
                for (u in e)n[u] || (n[u] = e[u]);
                for (u in n)c.subs[u] = n[u];
                i = i || {}, c.stackPartials = i;
                for (u in r)i[u] || (i[u] = r[u]);
                for (u in i)c.partials[u] = i[u];
                return c
            }

            function n(t) {
                return String(null === t || void 0 === t ? "" : t)
            }

            function i(t) {
                return t = n(t), l.test(t) ? t.replace(s, "&amp;").replace(o, "&lt;").replace(a, "&gt;").replace(u, "&#39;").replace(c, "&quot;") : t
            }

            t.Template = function (t, e, r, n) {
                t = t || {}, this.r = t.code || this.r, this.c = r, this.options = n || {}, this.text = e || "", this.partials = t.partials || {}, this.subs = t.subs || {}, this.buf = ""
            }, t.Template.prototype = {
                r: function (t, e, r) {
                    return ""
                }, v: i, t: n, render: function (t, e, r) {
                    return this.ri([t], e || {}, r)
                }, ri: function (t, e, r) {
                    return this.r(t, e, r)
                }, ep: function (t, e) {
                    var n = this.partials[t], i = e[n.name];
                    if (n.instance && n.base == i)return n.instance;
                    if ("string" == typeof i) {
                        if (!this.c)throw new Error("No compiler available.");
                        i = this.c.compile(i, this.options)
                    }
                    if (!i)return null;
                    if (this.partials[t].base = i, n.subs) {
                        e.stackText || (e.stackText = {});
                        for (key in n.subs)e.stackText[key] || (e.stackText[key] = void 0 !== this.activeSub && e.stackText[this.activeSub] ? e.stackText[this.activeSub] : this.text);
                        i = r(i, n.subs, n.partials, this.stackSubs, this.stackPartials, e.stackText)
                    }
                    return this.partials[t].instance = i, i
                }, rp: function (t, e, r, n) {
                    var i = this.ep(t, r);
                    return i ? i.ri(e, r, n) : ""
                }, rs: function (t, e, r) {
                    var n = t[t.length - 1];
                    if (!f(n))return void r(t, e, this);
                    for (var i = 0; i < n.length; i++)t.push(n[i]), r(t, e, this), t.pop()
                }, s: function (t, e, r, n, i, s, o) {
                    var a;
                    return (!f(t) || 0 !== t.length) && ("function" == typeof t && (t = this.ms(t, e, r, n, i, s, o)), a = !!t, !n && a && e && e.push("object" == typeof t ? t : e[e.length - 1]), a)
                }, d: function (t, r, n, i) {
                    var s, o = t.split("."), a = this.f(o[0], r, n, i), u = this.options.modelGet, c = null;
                    if ("." === t && f(r[r.length - 2]))a = r[r.length - 1]; else for (var l = 1; l < o.length; l++)s = e(o[l], a, u), void 0 !== s ? (c = a, a = s) : a = "";
                    return !(i && !a) && (i || "function" != typeof a || (r.push(c), a = this.mv(a, r, n), r.pop()), a)
                }, f: function (t, r, n, i) {
                    for (var s = !1, o = null, a = !1, u = this.options.modelGet, c = r.length - 1; c >= 0; c--)if (o = r[c], s = e(t, o, u), void 0 !== s) {
                        a = !0;
                        break
                    }
                    return a ? (i || "function" != typeof s || (s = this.mv(s, r, n)), s) : !i && ""
                }, ls: function (t, e, r, i, s) {
                    var o = this.options.delimiters;
                    return this.options.delimiters = s, this.b(this.ct(n(t.call(e, i)), e, r)), this.options.delimiters = o, !1
                }, ct: function (t, e, r) {
                    if (this.options.disableLambda)throw new Error("Lambda features disabled.");
                    return this.c.compile(t, this.options).render(e, r)
                }, b: function (t) {
                    this.buf += t
                }, fl: function () {
                    var t = this.buf;
                    return this.buf = "", t
                }, ms: function (t, e, r, n, i, s, o) {
                    var a, u = e[e.length - 1], c = t.call(u);
                    return "function" == typeof c ? !!n || (a = this.activeSub && this.subsText && this.subsText[this.activeSub] ? this.subsText[this.activeSub] : this.text, this.ls(c, u, r, a.substring(i, s), o)) : c
                }, mv: function (t, e, r) {
                    var i = e[e.length - 1], s = t.call(i);
                    return "function" == typeof s ? this.ct(n(s.call(i)), i, r) : s
                }, sub: function (t, e, r, n) {
                    var i = this.subs[t];
                    i && (this.activeSub = t, i(e, r, this, n), this.activeSub = !1)
                }
            };
            var s = /&/g, o = /</g, a = />/g, u = /\'/g, c = /\"/g, l = /[&<>\"\']/, f = Array.isArray || function (t) {
                    return "[object Array]" === Object.prototype.toString.call(t)
                }
        }(e)
    }, 31: function (t, e) {
    }, 61: function (t, e, r) {
        "use strict";
        r(31);
        var n = r(1), i = r(2), s = {
            show: function (t) {
                $(".err-item").show().find(".err-msg").text(t)
            }, hide: function () {
                $(".err-item").hide().find(".err-msg").text("")
            }
        }, o = {
            data: {redirectUrl: n.getUrlParam("redirect")}, init: function () {
                this.bindEvent()
            }, bindEvent: function () {
                var t = this;
                $("#submit").click(function () {
                    var e = {username: $("#username").val(), password: $("#password").val()}, r = t.validiteFormData(e);
                    r.status ? i.login(e, function (e) {
                        window.location.href = t.data.redirectUrl || "../product/index.do"
                    }, function (t) {
                        s.show(t)
                    }) : s.show(r.msg)
                }), $("input").on("keyup", function (t) {
                    13 === t.keyCode && $("#submit").trigger("click")
                })
            }, validiteFormData: function (t) {
                var e = {status: !1, msg: ""};
                return n.validate(t.username, "require") ? n.validate(t.password, "require") ? (e.status = !0, e.msg = "验证通过", e) : (e.msg = "密码不能为空", e) : (e.msg = "用户名不能为空", e)
            }
        };
        $(function () {
            o.init()
        })
    }
});