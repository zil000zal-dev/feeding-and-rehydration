Feeding & Rehydration - Android project

هذا مشروع Android Studio لتطبيق يعمل دون إنترنت، ولا يحتاج Excel أو Python على الهاتف.

طريقة إنشاء APK:
1) ثبّت Android Studio على كمبيوتر Windows/Mac/Linux.
2) فك ضغط هذا الملف.
3) من Android Studio اختر Open ثم اختر مجلد FeedingRehydration.
4) انتظر Gradle Sync. إذا طلب تثبيت Android SDK أو Build Tools وافق.
5) من القائمة Build اختر Build Bundle(s) / APK(s) ثم Build APK(s).
6) بعد اكتمال البناء اضغط locate من إشعار Android Studio، وستجد app-debug.apk.
7) انقل APK إلى هاتف Android وثبّته. قد تحتاج السماح بالتثبيت من هذا المصدر.

المتطلبات: Android Studio حديث وJDK 17 وAndroid SDK 34 واتصال إنترنت أول مرة لتنزيل مكونات Gradle.

مهم سريرياً:
- Feeding: kcal/day = الوزن × 100؛ oz/day = kcal/day ÷ 20؛ oz/feed = oz/day ÷ 8.
- Rehydration: bolus 20 min = 20 × الوزن؛ bolus 1 h = 3 × bolus 20 min.
- Deficit = (نسبة الجفاف ÷ 100) × الوزن × 1000؛ Maintenance حسب شرائح 100/50/20 mL/kg؛ Total 23h = maintenance + deficit - bolus 1h.

تم تحويل إدخال الجفاف إلى نسبة مئوية بشرية (مثلاً 5 تعني 5%)، ثم تحويلها إلى كسر عشري قبل تطبيق معادلة Excel. هذا يطابق طريقة تخزين النسبة المئوية المعتادة في Excel. راجع البروتوكول السريري قبل الاستخدام؛ التطبيق لا يحدد ملاءمة السوائل أو bolus لمريض بعينه.
