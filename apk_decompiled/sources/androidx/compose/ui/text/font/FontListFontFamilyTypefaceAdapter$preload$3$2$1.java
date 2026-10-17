package androidx.compose.ui.text.font;

import defpackage.bq;
import defpackage.d41;
import defpackage.hm;
import defpackage.ky;
import defpackage.my;
import defpackage.o;
import defpackage.p10;
import defpackage.un;
import defpackage.us0;
import defpackage.vn;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@bq(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {109}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter$preload$3$2$1 extends us0 implements my {
    final /* synthetic */ Font $font;
    final /* synthetic */ PlatformFontLoader $resourceLoader;
    int label;
    final /* synthetic */ FontListFontFamilyTypefaceAdapter this$0;

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    @bq(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {111}, m = "invokeSuspend", v = 1)
    /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends us0 implements ky {
        final /* synthetic */ Font $font;
        final /* synthetic */ PlatformFontLoader $resourceLoader;
        int label;

        /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
        @bq(c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1", f = "FontListFontFamilyTypefaceAdapter.kt", l = {112}, m = "invokeSuspend", v = 1)
        /* renamed from: androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3$2$1$1$1, reason: invalid class name and collision with other inner class name */
        public static final class C00271 extends us0 implements my {
            final /* synthetic */ Font $font;
            final /* synthetic */ PlatformFontLoader $resourceLoader;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00271(PlatformFontLoader platformFontLoader, Font font, hm hmVar) {
                super(2, hmVar);
                this.$resourceLoader = platformFontLoader;
                this.$font = font;
            }

            @Override // defpackage.mc
            public final hm create(Object obj, hm hmVar) {
                return new C00271(this.$resourceLoader, this.$font, hmVar);
            }

            @Override // defpackage.my
            public final Object invoke(un unVar, hm hmVar) {
                return ((C00271) create(unVar, hmVar)).invokeSuspend(w01.a);
            }

            @Override // defpackage.mc
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i != 0) {
                    if (i == 1) {
                        p10.Q(obj);
                        return obj;
                    }
                    o.f("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                p10.Q(obj);
                PlatformFontLoader platformFontLoader = this.$resourceLoader;
                Font font = this.$font;
                this.label = 1;
                Object awaitLoad = platformFontLoader.awaitLoad(font, this);
                vn vnVar = vn.d;
                return awaitLoad == vnVar ? vnVar : awaitLoad;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Font font, PlatformFontLoader platformFontLoader, hm hmVar) {
            super(1, hmVar);
            this.$font = font;
            this.$resourceLoader = platformFontLoader;
        }

        @Override // defpackage.mc
        public final hm create(hm hmVar) {
            return new AnonymousClass1(this.$font, this.$resourceLoader, hmVar);
        }

        @Override // defpackage.ky
        public final Object invoke(hm hmVar) {
            return ((AnonymousClass1) create(hmVar)).invokeSuspend(w01.a);
        }

        @Override // defpackage.mc
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            try {
                if (i == 0) {
                    p10.Q(obj);
                    C00271 c00271 = new C00271(this.$resourceLoader, this.$font, null);
                    this.label = 1;
                    obj = d41.Q(15000L, c00271, this);
                    vn vnVar = vn.d;
                    if (obj == vnVar) {
                        return vnVar;
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    p10.Q(obj);
                }
                if (obj != null) {
                    return obj;
                }
                o.s(this.$font, "Unable to load font ");
                return null;
            } catch (Exception e) {
                throw new IllegalStateException("Unable to load font " + this.$font, e);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FontListFontFamilyTypefaceAdapter$preload$3$2$1(FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter, Font font, PlatformFontLoader platformFontLoader, hm hmVar) {
        super(2, hmVar);
        this.this$0 = fontListFontFamilyTypefaceAdapter;
        this.$font = font;
        this.$resourceLoader = platformFontLoader;
    }

    @Override // defpackage.mc
    public final hm create(Object obj, hm hmVar) {
        return new FontListFontFamilyTypefaceAdapter$preload$3$2$1(this.this$0, this.$font, this.$resourceLoader, hmVar);
    }

    @Override // defpackage.my
    public final Object invoke(un unVar, hm hmVar) {
        return ((FontListFontFamilyTypefaceAdapter$preload$3$2$1) create(unVar, hmVar)).invokeSuspend(w01.a);
    }

    @Override // defpackage.mc
    public final Object invokeSuspend(Object obj) {
        AsyncTypefaceCache asyncTypefaceCache;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                p10.Q(obj);
                return obj;
            }
            o.f("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        p10.Q(obj);
        asyncTypefaceCache = this.this$0.asyncTypefaceCache;
        Font font = this.$font;
        PlatformFontLoader platformFontLoader = this.$resourceLoader;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(font, platformFontLoader, null);
        this.label = 1;
        Object runCached = asyncTypefaceCache.runCached(font, platformFontLoader, true, anonymousClass1, this);
        vn vnVar = vn.d;
        return runCached == vnVar ? vnVar : runCached;
    }
}
