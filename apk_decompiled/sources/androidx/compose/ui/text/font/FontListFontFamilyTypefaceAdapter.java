package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.TypefaceResult;
import androidx.compose.ui.text.platform.DispatcherKt;
import defpackage.dq;
import defpackage.gb0;
import defpackage.hm;
import defpackage.kn;
import defpackage.ky;
import defpackage.nn;
import defpackage.on;
import defpackage.p01;
import defpackage.p10;
import defpackage.qo;
import defpackage.qs0;
import defpackage.st;
import defpackage.ts;
import defpackage.un;
import defpackage.vn;
import defpackage.w01;
import defpackage.xe0;
import defpackage.xn;
import defpackage.yi;
import defpackage.z10;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    private un asyncLoadScope;
    private final AsyncTypefaceCache asyncTypefaceCache;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();
    private static final on DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(nn.d);

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, kn knVar) {
        this.asyncTypefaceCache = asyncTypefaceCache;
        this.asyncLoadScope = p10.a(DropExceptionHandler.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(knVar).plus(new qs0((z10) knVar.get(ts.l))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 preload$lambda$3$0(TypefaceRequest typefaceRequest) {
        return w01.a;
    }

    public final Object preload(FontFamily fontFamily, PlatformFontLoader platformFontLoader, hm hmVar) {
        xe0 firstImmediatelyAvailable;
        FontFamily fontFamily2 = fontFamily;
        boolean z = fontFamily2 instanceof FontListFontFamily;
        w01 w01Var = w01.a;
        if (!z) {
            return w01Var;
        }
        FontListFontFamily fontListFontFamily = (FontListFontFamily) fontFamily2;
        List<Font> fonts = fontListFontFamily.getFonts();
        List<Font> fonts2 = fontListFontFamily.getFonts();
        ArrayList arrayList = new ArrayList(fonts2.size());
        int size = fonts2.size();
        for (int i = 0; i < size; i++) {
            Font font = fonts2.get(i);
            if (FontLoadingStrategy.m7159equalsimpl0(font.mo7117getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m7163getAsyncPKNRLFQ())) {
                arrayList.add(new xe0(font.getWeight(), FontStyle.m7169boximpl(font.mo7125getStyle_LCdwA())));
            }
        }
        gb0 gb0Var = new gb0(arrayList.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            Object obj = arrayList.get(i2);
            if (gb0Var.d((xe0) obj)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            xe0 xe0Var = (xe0) arrayList2.get(i3);
            FontWeight fontWeight = (FontWeight) xe0Var.d;
            int m7175unboximpl = ((FontStyle) xe0Var.e).m7175unboximpl();
            firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m7168matchFontRetOiIg(fonts, fontWeight, m7175unboximpl), new TypefaceRequest(fontFamily2, fontWeight, m7175unboximpl, FontSynthesis.Companion.m7189getAllGVVA2EU(), platformFontLoader.getCacheKey(), null), this.asyncTypefaceCache, platformFontLoader, new qo(28));
            List list = (List) firstImmediatelyAvailable.d;
            if (list != null) {
                arrayList3.add(yi.p0(list));
            }
            i3++;
            fontFamily2 = fontFamily;
        }
        Object n = p10.n(new FontListFontFamilyTypefaceAdapter$preload$3(arrayList3, this, platformFontLoader, null), hmVar);
        return n == vn.d ? n : w01Var;
    }

    @Override // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    public TypefaceResult resolve(TypefaceRequest typefaceRequest, PlatformFontLoader platformFontLoader, ky kyVar, ky kyVar2) {
        xe0 firstImmediatelyAvailable;
        if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        firstImmediatelyAvailable = FontListFontFamilyTypefaceAdapterKt.firstImmediatelyAvailable(fontMatcher.m7168matchFontRetOiIg(((FontListFontFamily) typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.m7218getFontStyle_LCdwA()), typefaceRequest, this.asyncTypefaceCache, platformFontLoader, kyVar2);
        List list = (List) firstImmediatelyAvailable.d;
        Object obj = firstImmediatelyAvailable.e;
        if (list == null) {
            return new TypefaceResult.Immutable(obj, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader = new AsyncFontListLoader(list, obj, typefaceRequest, this.asyncTypefaceCache, kyVar, platformFontLoader);
        p01.t(this.asyncLoadScope, null, xn.g, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncFontListLoader, null), 1);
        return new TypefaceResult.Async(asyncFontListLoader);
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final on getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
        }

        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.fontMatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FontListFontFamilyTypefaceAdapter() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public /* synthetic */ FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache, kn knVar, int i, dq dqVar) {
        this((i & 1) != 0 ? new AsyncTypefaceCache() : asyncTypefaceCache, (i & 2) != 0 ? st.d : knVar);
    }
}
