package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.SynchronizedObject;
import defpackage.ky;
import defpackage.s60;
import defpackage.te0;
import defpackage.w01;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class TypefaceRequestCache {
    public static final int $stable = 8;
    private final SynchronizedObject lock = new SynchronizedObject();
    private final s60 resultCache = new s60(16);

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 runCached$lambda$1(TypefaceRequestCache typefaceRequestCache, TypefaceRequest typefaceRequest, TypefaceResult typefaceResult) {
        synchronized (typefaceRequestCache.lock) {
            try {
                boolean cacheable = typefaceResult.getCacheable();
                s60 s60Var = typefaceRequestCache.resultCache;
                if (cacheable) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return w01.a;
    }

    public final TypefaceResult get$ui_text(TypefaceRequest typefaceRequest) {
        TypefaceResult typefaceResult;
        synchronized (this.lock) {
            typefaceResult = (TypefaceResult) this.resultCache.a(typefaceRequest);
        }
        return typefaceResult;
    }

    public final SynchronizedObject getLock$ui_text() {
        return this.lock;
    }

    public final int getSize$ui_text() {
        int i;
        synchronized (this.lock) {
            s60 s60Var = this.resultCache;
            synchronized (s60Var.c) {
                i = s60Var.d;
            }
        }
        return i;
    }

    public final void preWarmCache(List<TypefaceRequest> list, ky kyVar) {
        TypefaceResult typefaceResult;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            TypefaceRequest typefaceRequest = list.get(i);
            synchronized (this.lock) {
                typefaceResult = (TypefaceResult) this.resultCache.a(typefaceRequest);
            }
            if (typefaceResult == null) {
                try {
                    TypefaceResult typefaceResult2 = (TypefaceResult) kyVar.invoke(typefaceRequest);
                    if (typefaceResult2 instanceof TypefaceResult.Async) {
                        continue;
                    }
                } catch (Exception e) {
                    throw new IllegalStateException("Could not load font", e);
                }
            }
        }
    }

    public final State<Object> runCached(TypefaceRequest typefaceRequest, ky kyVar) {
        synchronized (this.lock) {
            TypefaceResult typefaceResult = (TypefaceResult) this.resultCache.a(typefaceRequest);
            if (typefaceResult != null) {
                if (typefaceResult.getCacheable()) {
                    return typefaceResult;
                }
            }
            try {
                TypefaceResult typefaceResult2 = (TypefaceResult) kyVar.invoke(new te0(23, this, typefaceRequest));
                synchronized (this.lock) {
                    if (this.resultCache.a(typefaceRequest) == null && typefaceResult2.getCacheable()) {
                        this.resultCache.b(typefaceRequest, typefaceResult2);
                    }
                }
                return typefaceResult2;
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
    }
}
