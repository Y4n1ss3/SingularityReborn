package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.compose.ui.util.ListUtilsKt;
import defpackage.dq;
import defpackage.er;
import defpackage.fb0;
import defpackage.gb0;
import defpackage.o;
import defpackage.pl0;
import defpackage.ql0;
import defpackage.xe0;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
@er
/* loaded from: classes2.dex */
public final class AndroidFontListTypeface implements AndroidTypeface {
    private final FontFamily fontFamily;
    private final FontMatcher fontMatcher$1;
    private final pl0 loadedTypefaces;
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final FontMatcher fontMatcher = new FontMatcher();

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List<xe0> list, FontMatcher fontMatcher2) {
        ArrayList arrayList;
        int size;
        this.fontMatcher$1 = fontMatcher2;
        List<Font> fonts = fontListFontFamily.getFonts();
        ArrayList arrayList2 = new ArrayList(fonts.size());
        int size2 = fonts.size();
        for (int i = 0; i < size2; i++) {
            Font font = fonts.get(i);
            if (FontLoadingStrategy.m7159equalsimpl0(font.mo7117getLoadingStrategyPKNRLFQ(), FontLoadingStrategy.Companion.m7164getBlockingPKNRLFQ())) {
                arrayList2.add(font);
            }
        }
        if (list != null) {
            ArrayList arrayList3 = new ArrayList(list.size());
            int size3 = list.size();
            for (int i2 = 0; i2 < size3; i2++) {
                xe0 xe0Var = list.get(i2);
                arrayList3.add((Font) yi.q0(this.fontMatcher$1.m7168matchFontRetOiIg(arrayList2, (FontWeight) xe0Var.d, ((FontStyle) xe0Var.e).m7175unboximpl())));
            }
            List fastFilterNotNull = ListUtilsKt.fastFilterNotNull(arrayList3);
            if (fastFilterNotNull != null) {
                gb0 gb0Var = new gb0(fastFilterNotNull.size());
                arrayList = new ArrayList(fastFilterNotNull.size());
                int size4 = fastFilterNotNull.size();
                for (int i3 = 0; i3 < size4; i3++) {
                    Object obj = fastFilterNotNull.get(i3);
                    if (gb0Var.d((Font) obj)) {
                        arrayList.add(obj);
                    }
                }
                arrayList2 = arrayList != null ? arrayList : arrayList2;
                if (arrayList2.isEmpty()) {
                    InlineClassHelperKt.throwIllegalStateException("Could not match font");
                }
                long[] jArr = ql0.a;
                fb0 fb0Var = new fb0();
                size = arrayList2.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Font font2 = (Font) arrayList2.get(i4);
                    try {
                        fb0Var.l(font2, AndroidTypefaceCache.INSTANCE.getOrCreate(context, font2));
                    } catch (Exception unused) {
                        InlineClassHelperKt.throwIllegalStateException("Cannot create Typeface from " + font2);
                    }
                }
                this.loadedTypefaces = fb0Var;
                this.fontFamily = fontListFontFamily;
            }
        }
        arrayList = null;
        if (arrayList != null) {
        }
        if (arrayList2.isEmpty()) {
        }
        long[] jArr2 = ql0.a;
        fb0 fb0Var2 = new fb0();
        size = arrayList2.size();
        while (i4 < size) {
        }
        this.loadedTypefaces = fb0Var2;
        this.fontFamily = fontListFontFamily;
    }

    @Override // androidx.compose.ui.text.font.Typeface
    public FontFamily getFontFamily() {
        return this.fontFamily;
    }

    public final FontMatcher getFontMatcher() {
        return this.fontMatcher$1;
    }

    @Override // androidx.compose.ui.text.platform.AndroidTypeface
    /* renamed from: getNativeTypeface-PYhJU0U */
    public Typeface mo7313getNativeTypefacePYhJU0U(FontWeight fontWeight, int i, int i2) {
        ArrayList arrayList = new ArrayList();
        pl0 pl0Var = this.loadedTypefaces;
        Object[] objArr = pl0Var.b;
        long[] jArr = pl0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            arrayList.add((Font) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    }
                }
                if (i3 == length) {
                    break;
                }
                i3++;
            }
        }
        Font font = (Font) yi.q0(this.fontMatcher$1.m7168matchFontRetOiIg(arrayList, fontWeight, i));
        if (font == null) {
            InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load font");
            o.j();
            return null;
        }
        Typeface typeface = (Typeface) this.loadedTypefaces.d(font);
        if (typeface != null) {
            Object m7194synthesizeTypefaceFxwP2eA = FontSynthesis_androidKt.m7194synthesizeTypefaceFxwP2eA(i2, typeface, font, fontWeight, i);
            m7194synthesizeTypefaceFxwP2eA.getClass();
            return (Typeface) m7194synthesizeTypefaceFxwP2eA;
        }
        InlineClassHelperKt.throwIllegalStateExceptionForNullCheck("Could not load typeface");
        o.j();
        return null;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final FontMatcher getFontMatcher() {
            return AndroidFontListTypeface.fontMatcher;
        }

        private Companion() {
        }
    }

    public /* synthetic */ AndroidFontListTypeface(FontListFontFamily fontListFontFamily, Context context, List list, FontMatcher fontMatcher2, int i, dq dqVar) {
        this(fontListFontFamily, context, (i & 4) != 0 ? null : list, (i & 8) != 0 ? fontMatcher : fontMatcher2);
    }
}
