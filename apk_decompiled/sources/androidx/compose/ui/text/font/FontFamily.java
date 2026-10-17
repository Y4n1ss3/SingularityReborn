package androidx.compose.ui.text.font;

import androidx.compose.runtime.State;
import defpackage.dq;
import defpackage.er;
import defpackage.hm;
import defpackage.lu0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class FontFamily {
    public static final int $stable = 0;
    private final boolean canLoadSynchronously;
    public static final Companion Companion = new Companion(null);
    private static final SystemFontFamily Default = new DefaultFontFamily();
    private static final GenericFontFamily SansSerif = new GenericFontFamily("sans-serif", "FontFamily.SansSerif");
    private static final GenericFontFamily Serif = new GenericFontFamily("serif", "FontFamily.Serif");
    private static final GenericFontFamily Monospace = new GenericFontFamily("monospace", "FontFamily.Monospace");
    private static final GenericFontFamily Cursive = new GenericFontFamily("cursive", "FontFamily.Cursive");

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public interface Resolver {
        /* renamed from: resolve-DPcqOEQ$default, reason: not valid java name */
        static /* synthetic */ State m7144resolveDPcqOEQ$default(Resolver resolver, FontFamily fontFamily, FontWeight fontWeight, int i, int i2, int i3, Object obj) {
            if (obj != null) {
                lu0.a("Super calls with default arguments not supported in this target, function: resolve-DPcqOEQ");
                return null;
            }
            if ((i3 & 1) != 0) {
                fontFamily = null;
            }
            if ((i3 & 2) != 0) {
                fontWeight = FontWeight.Companion.getNormal();
            }
            if ((i3 & 4) != 0) {
                i = FontStyle.Companion.m7179getNormal_LCdwA();
            }
            if ((i3 & 8) != 0) {
                i2 = FontSynthesis.Companion.m7189getAllGVVA2EU();
            }
            return resolver.mo7145resolveDPcqOEQ(fontFamily, fontWeight, i, i2);
        }

        Object preload(FontFamily fontFamily, hm hmVar);

        /* renamed from: resolve-DPcqOEQ, reason: not valid java name */
        State<Object> mo7145resolveDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i, int i2);
    }

    private FontFamily(boolean z) {
        this.canLoadSynchronously = z;
    }

    @er
    public final boolean getCanLoadSynchronously() {
        return this.canLoadSynchronously;
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        public final GenericFontFamily getCursive() {
            return FontFamily.Cursive;
        }

        public final SystemFontFamily getDefault() {
            return FontFamily.Default;
        }

        public final GenericFontFamily getMonospace() {
            return FontFamily.Monospace;
        }

        public final GenericFontFamily getSansSerif() {
            return FontFamily.SansSerif;
        }

        public final GenericFontFamily getSerif() {
            return FontFamily.Serif;
        }

        private Companion() {
        }
    }

    public /* synthetic */ FontFamily(boolean z, dq dqVar) {
        this(z);
    }

    public static /* synthetic */ void getCanLoadSynchronously$annotations() {
    }
}
