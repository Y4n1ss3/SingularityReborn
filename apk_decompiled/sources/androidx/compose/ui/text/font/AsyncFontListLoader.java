package androidx.compose.ui.text.font;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.TypefaceResult;
import defpackage.cq;
import defpackage.d41;
import defpackage.hm;
import defpackage.ky;
import defpackage.nn;
import defpackage.o;
import defpackage.on;
import defpackage.p10;
import defpackage.vn;
import defpackage.w01;
import java.util.List;
import java.util.concurrent.CancellationException;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AsyncFontListLoader implements State<Object> {
    public static final int $stable = 0;
    private final AsyncTypefaceCache asyncTypefaceCache;
    private boolean cacheable = true;
    private final List<Font> fontList;
    private final ky onCompletion;
    private final PlatformFontLoader platformFontLoader;
    private final TypefaceRequest typefaceRequest;
    private final MutableState value$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    public AsyncFontListLoader(List<? extends Font> list, Object obj, TypefaceRequest typefaceRequest, AsyncTypefaceCache asyncTypefaceCache, ky kyVar, PlatformFontLoader platformFontLoader) {
        this.fontList = list;
        this.typefaceRequest = typefaceRequest;
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.onCompletion = kyVar;
        this.platformFontLoader = platformFontLoader;
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
    }

    private void setValue(Object obj) {
        this.value$delegate.setValue(obj);
    }

    public final boolean getCacheable$ui_text() {
        return this.cacheable;
    }

    @Override // androidx.compose.runtime.State
    public Object getValue() {
        return this.value$delegate.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00df, code lost:
    
        if (defpackage.q10.J(r2) == r9) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009f A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:27:0x009f, B:30:0x00d1, B:41:0x0050, B:44:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1 A[Catch: all -> 0x003b, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:27:0x009f, B:30:0x00d1, B:41:0x0050, B:44:0x005c), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007b -> B:14:0x00e9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00df -> B:13:0x00e2). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object load(hm hmVar) {
        AsyncFontListLoader$load$1 asyncFontListLoader$load$1;
        int i;
        List<Font> list;
        int size;
        AsyncFontListLoader$load$1 asyncFontListLoader$load$12;
        int i2;
        Font font;
        List<Font> list2;
        int i3;
        ky kyVar;
        TypefaceResult.Immutable immutable;
        try {
            if (hmVar instanceof AsyncFontListLoader$load$1) {
                asyncFontListLoader$load$1 = (AsyncFontListLoader$load$1) hmVar;
                int i4 = asyncFontListLoader$load$1.label;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$load$1.label = i4 - Integer.MIN_VALUE;
                    Object obj = asyncFontListLoader$load$1.result;
                    i = asyncFontListLoader$load$1.label;
                    w01 w01Var = w01.a;
                    vn vnVar = vn.d;
                    if (i != 0) {
                        p10.Q(obj);
                        list = this.fontList;
                        size = list.size();
                        asyncFontListLoader$load$12 = asyncFontListLoader$load$1;
                        i2 = 0;
                        if (i2 < size) {
                        }
                    } else if (i == 1) {
                        size = asyncFontListLoader$load$1.I$1;
                        i3 = asyncFontListLoader$load$1.I$0;
                        Font font2 = (Font) asyncFontListLoader$load$1.L$1;
                        List<Font> list3 = (List) asyncFontListLoader$load$1.L$0;
                        p10.Q(obj);
                        font = font2;
                        list2 = list3;
                        if (obj == null) {
                        }
                    } else {
                        if (i != 2) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        size = asyncFontListLoader$load$1.I$1;
                        i3 = asyncFontListLoader$load$1.I$0;
                        list2 = (List) asyncFontListLoader$load$1.L$0;
                        p10.Q(obj);
                        asyncFontListLoader$load$12 = asyncFontListLoader$load$1;
                        i2 = i3;
                        list = list2;
                        i2++;
                        if (i2 < size) {
                            try {
                                Font font3 = list.get(i2);
                                if (FontLoadingStrategy.m7159equalsimpl0(font3.mo7117getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m7163getAsyncPKNRLFQ())) {
                                    AsyncTypefaceCache asyncTypefaceCache = this.asyncTypefaceCache;
                                    PlatformFontLoader platformFontLoader = this.platformFontLoader;
                                    AsyncFontListLoader$load$2$typeface$1 asyncFontListLoader$load$2$typeface$1 = new AsyncFontListLoader$load$2$typeface$1(this, font3, null);
                                    asyncFontListLoader$load$12.L$0 = list;
                                    asyncFontListLoader$load$12.L$1 = font3;
                                    asyncFontListLoader$load$12.I$0 = i2;
                                    asyncFontListLoader$load$12.I$1 = size;
                                    asyncFontListLoader$load$12.label = 1;
                                    Object runCached = asyncTypefaceCache.runCached(font3, platformFontLoader, false, asyncFontListLoader$load$2$typeface$1, asyncFontListLoader$load$12);
                                    if (runCached != vnVar) {
                                        font = font3;
                                        list2 = list;
                                        obj = runCached;
                                        i3 = i2;
                                        asyncFontListLoader$load$1 = asyncFontListLoader$load$12;
                                        if (obj == null) {
                                            setValue(FontSynthesis_androidKt.m7194synthesizeTypefaceFxwP2eA(this.typefaceRequest.m7219getFontSynthesisGVVA2EU(), obj, font, this.typefaceRequest.getFontWeight(), this.typefaceRequest.m7218getFontStyle_LCdwA()));
                                            boolean x = cq.x(asyncFontListLoader$load$1.getContext());
                                            this.cacheable = false;
                                            kyVar = this.onCompletion;
                                            immutable = new TypefaceResult.Immutable(getValue(), x);
                                            kyVar.invoke(immutable);
                                            return w01Var;
                                        }
                                        asyncFontListLoader$load$1.L$0 = list2;
                                        asyncFontListLoader$load$1.L$1 = null;
                                        asyncFontListLoader$load$1.I$0 = i3;
                                        asyncFontListLoader$load$1.I$1 = size;
                                        asyncFontListLoader$load$1.label = 2;
                                    }
                                    return vnVar;
                                }
                                i2++;
                                if (i2 < size) {
                                    boolean x2 = cq.x(asyncFontListLoader$load$12.getContext());
                                    this.cacheable = false;
                                    kyVar = this.onCompletion;
                                    immutable = new TypefaceResult.Immutable(getValue(), x2);
                                    kyVar.invoke(immutable);
                                    return w01Var;
                                }
                            } catch (Throwable th) {
                                th = th;
                                asyncFontListLoader$load$1 = asyncFontListLoader$load$12;
                                boolean x3 = cq.x(asyncFontListLoader$load$1.getContext());
                                this.cacheable = false;
                                this.onCompletion.invoke(new TypefaceResult.Immutable(getValue(), x3));
                                throw th;
                            }
                        }
                    }
                }
            }
            if (i != 0) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        asyncFontListLoader$load$1 = new AsyncFontListLoader$load$1(this, hmVar);
        Object obj2 = asyncFontListLoader$load$1.result;
        i = asyncFontListLoader$load$1.label;
        w01 w01Var2 = w01.a;
        vn vnVar2 = vn.d;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object loadWithTimeoutOrNull$ui_text(Font font, hm hmVar) {
        AsyncFontListLoader$loadWithTimeoutOrNull$1 asyncFontListLoader$loadWithTimeoutOrNull$1;
        int i;
        try {
            if (hmVar instanceof AsyncFontListLoader$loadWithTimeoutOrNull$1) {
                asyncFontListLoader$loadWithTimeoutOrNull$1 = (AsyncFontListLoader$loadWithTimeoutOrNull$1) hmVar;
                int i2 = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
                    i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
                    if (i == 0) {
                        if (i != 1) {
                            o.f("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        p10.Q(obj);
                        return obj;
                    }
                    p10.Q(obj);
                    AsyncFontListLoader$loadWithTimeoutOrNull$2 asyncFontListLoader$loadWithTimeoutOrNull$2 = new AsyncFontListLoader$loadWithTimeoutOrNull$2(this, font, null);
                    asyncFontListLoader$loadWithTimeoutOrNull$1.L$0 = font;
                    asyncFontListLoader$loadWithTimeoutOrNull$1.label = 1;
                    Object R = d41.R(15000L, asyncFontListLoader$loadWithTimeoutOrNull$2, asyncFontListLoader$loadWithTimeoutOrNull$1);
                    vn vnVar = vn.d;
                    return R == vnVar ? vnVar : R;
                }
            }
            if (i == 0) {
            }
        } catch (CancellationException e) {
            if (!cq.x(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext())) {
                throw e;
            }
            return null;
        } catch (Exception e2) {
            on onVar = (on) asyncFontListLoader$loadWithTimeoutOrNull$1.getContext().get(nn.d);
            if (onVar != null) {
                onVar.handleException(asyncFontListLoader$loadWithTimeoutOrNull$1.getContext(), new IllegalStateException("Unable to load font " + font, e2));
            }
            return null;
        }
        asyncFontListLoader$loadWithTimeoutOrNull$1 = new AsyncFontListLoader$loadWithTimeoutOrNull$1(this, hmVar);
        Object obj2 = asyncFontListLoader$loadWithTimeoutOrNull$1.result;
        i = asyncFontListLoader$loadWithTimeoutOrNull$1.label;
    }

    public final void setCacheable$ui_text(boolean z) {
        this.cacheable = z;
    }
}
