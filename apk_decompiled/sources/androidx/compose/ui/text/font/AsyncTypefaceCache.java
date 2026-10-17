package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.fb0;
import defpackage.hm;
import defpackage.iy;
import defpackage.ky;
import defpackage.o;
import defpackage.p10;
import defpackage.q10;
import defpackage.ql0;
import defpackage.s60;
import defpackage.vn;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AsyncTypefaceCache {
    public static final int $stable = 8;
    private final SynchronizedObject cacheLock;
    private final fb0 permanentCache;
    private final Object PermanentFailure = AsyncTypefaceResult.m7128constructorimpl(null);
    private final s60 resultCache = new s60(16);

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Key {
        public static final int $stable = 8;
        private final Font font;
        private final Object loaderKey;

        public Key(Font font, Object obj) {
            this.font = font;
            this.loaderKey = obj;
        }

        public static /* synthetic */ Key copy$default(Key key, Font font, Object obj, int i, Object obj2) {
            if ((i & 1) != 0) {
                font = key.font;
            }
            if ((i & 2) != 0) {
                obj = key.loaderKey;
            }
            return key.copy(font, obj);
        }

        public final Font component1() {
            return this.font;
        }

        public final Object component2() {
            return this.loaderKey;
        }

        public final Key copy(Font font, Object obj) {
            return new Key(font, obj);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            return q10.b(this.font, key.font) && q10.b(this.loaderKey, key.loaderKey);
        }

        public final Font getFont() {
            return this.font;
        }

        public final Object getLoaderKey() {
            return this.loaderKey;
        }

        public int hashCode() {
            int hashCode = this.font.hashCode() * 31;
            Object obj = this.loaderKey;
            return hashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.font + ", loaderKey=" + this.loaderKey + ')';
        }
    }

    public AsyncTypefaceCache() {
        long[] jArr = ql0.a;
        this.permanentCache = new fb0();
        this.cacheLock = new SynchronizedObject();
    }

    public static /* synthetic */ void put$default(AsyncTypefaceCache asyncTypefaceCache, Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        asyncTypefaceCache.put(font, platformFontLoader, obj, z);
    }

    /* renamed from: get-1ASDuI8, reason: not valid java name */
    public final AsyncTypefaceResult m7126get1ASDuI8(Font font, PlatformFontLoader platformFontLoader) {
        AsyncTypefaceResult asyncTypefaceResult;
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.a(key);
            if (asyncTypefaceResult == null) {
                asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.d(key);
            }
        }
        return asyncTypefaceResult;
    }

    public final void put(Font font, PlatformFontLoader platformFontLoader, Object obj, boolean z) {
        Key key = new Key(font, platformFontLoader.getCacheKey());
        synchronized (this.cacheLock) {
            try {
                if (obj == null) {
                    this.permanentCache.l(key, AsyncTypefaceResult.m7127boximpl(this.PermanentFailure));
                } else if (z) {
                    this.permanentCache.l(key, AsyncTypefaceResult.m7127boximpl(AsyncTypefaceResult.m7128constructorimpl(obj)));
                } else {
                    this.resultCache.b(key, AsyncTypefaceResult.m7127boximpl(AsyncTypefaceResult.m7128constructorimpl(obj)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0074 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object runCached(Font font, PlatformFontLoader platformFontLoader, boolean z, ky kyVar, hm hmVar) {
        AsyncTypefaceCache$runCached$1 asyncTypefaceCache$runCached$1;
        int i;
        Key key;
        if (hmVar instanceof AsyncTypefaceCache$runCached$1) {
            asyncTypefaceCache$runCached$1 = (AsyncTypefaceCache$runCached$1) hmVar;
            int i2 = asyncTypefaceCache$runCached$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                asyncTypefaceCache$runCached$1.label = i2 - Integer.MIN_VALUE;
                Object obj = asyncTypefaceCache$runCached$1.result;
                Object obj2 = vn.d;
                i = asyncTypefaceCache$runCached$1.label;
                if (i != 0) {
                    p10.Q(obj);
                    Key key2 = new Key(font, platformFontLoader.getCacheKey());
                    synchronized (this.cacheLock) {
                        try {
                            AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.a(key2);
                            if (asyncTypefaceResult == null) {
                                asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.d(key2);
                            }
                            if (asyncTypefaceResult != null) {
                                return asyncTypefaceResult.m7134unboximpl();
                            }
                            asyncTypefaceCache$runCached$1.L$0 = key2;
                            asyncTypefaceCache$runCached$1.Z$0 = z;
                            asyncTypefaceCache$runCached$1.label = 1;
                            Object invoke = kyVar.invoke(asyncTypefaceCache$runCached$1);
                            if (invoke == obj2) {
                                return obj2;
                            }
                            obj = invoke;
                            key = key2;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } else {
                    if (i != 1) {
                        o.f("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = asyncTypefaceCache$runCached$1.Z$0;
                    key = (Key) asyncTypefaceCache$runCached$1.L$0;
                    p10.Q(obj);
                }
                synchronized (this.cacheLock) {
                    try {
                        if (obj == null) {
                            this.permanentCache.l(key, AsyncTypefaceResult.m7127boximpl(this.PermanentFailure));
                        } else if (z) {
                            this.permanentCache.l(key, AsyncTypefaceResult.m7127boximpl(AsyncTypefaceResult.m7128constructorimpl(obj)));
                        } else {
                            this.resultCache.b(key, AsyncTypefaceResult.m7127boximpl(AsyncTypefaceResult.m7128constructorimpl(obj)));
                        }
                    } finally {
                    }
                }
                return obj;
            }
        }
        asyncTypefaceCache$runCached$1 = new AsyncTypefaceCache$runCached$1(this, hmVar);
        Object obj3 = asyncTypefaceCache$runCached$1.result;
        Object obj22 = vn.d;
        i = asyncTypefaceCache$runCached$1.label;
        if (i != 0) {
        }
        synchronized (this.cacheLock) {
        }
    }

    public final Object runCachedBlocking(Font font, PlatformFontLoader platformFontLoader, iy iyVar) {
        synchronized (this.cacheLock) {
            try {
                Key key = new Key(font, platformFontLoader.getCacheKey());
                AsyncTypefaceResult asyncTypefaceResult = (AsyncTypefaceResult) this.resultCache.a(key);
                if (asyncTypefaceResult == null) {
                    asyncTypefaceResult = (AsyncTypefaceResult) this.permanentCache.d(key);
                }
                if (asyncTypefaceResult != null) {
                    return asyncTypefaceResult.m7134unboximpl();
                }
                Object invoke = iyVar.invoke();
                put$default(this, font, platformFontLoader, invoke, false, 8, null);
                return invoke;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class AsyncTypefaceResult {
        private final Object result;

        private /* synthetic */ AsyncTypefaceResult(Object obj) {
            this.result = obj;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ AsyncTypefaceResult m7127boximpl(Object obj) {
            return new AsyncTypefaceResult(obj);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m7129equalsimpl(Object obj, Object obj2) {
            return (obj2 instanceof AsyncTypefaceResult) && q10.b(obj, ((AsyncTypefaceResult) obj2).m7134unboximpl());
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7130equalsimpl0(Object obj, Object obj2) {
            return q10.b(obj, obj2);
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m7131hashCodeimpl(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        /* renamed from: isPermanentFailure-impl, reason: not valid java name */
        public static final boolean m7132isPermanentFailureimpl(Object obj) {
            return obj == null;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7133toStringimpl(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return m7129equalsimpl(this.result, obj);
        }

        public final Object getResult() {
            return this.result;
        }

        public int hashCode() {
            return m7131hashCodeimpl(this.result);
        }

        public String toString() {
            return m7133toStringimpl(this.result);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ Object m7134unboximpl() {
            return this.result;
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static Object m7128constructorimpl(Object obj) {
            return obj;
        }
    }
}
