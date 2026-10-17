package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.er;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChromeReaderModeKt {
    private static ImageVector _chromeReaderMode;

    public static final ImageVector getChromeReaderMode(Icons.Sharp sharp) {
        ImageVector imageVector = _chromeReaderMode;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ChromeReaderMode", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(13.0f, 12.0f, 7.0f, 1.5f, -7.0f);
        uo.l(n, 13.0f, 12.0f, 13.0f, 9.5f);
        uo.n(n, 7.0f, 20.0f, 11.0f, -7.0f);
        uo.l(n, 13.0f, 9.5f, 13.0f, 14.5f);
        uo.n(n, 7.0f, 20.0f, 16.0f, -7.0f);
        r6.l(n, -1.5f, 23.0f, 4.0f);
        af0.m(n, 1.0f, 4.0f, 17.0f, 22.0f);
        uo.l(n, 23.0f, 4.0f, 21.0f, 19.0f);
        uo.n(n, -9.0f, 12.0f, 6.0f, 9.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(n, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _chromeReaderMode = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getChromeReaderMode$annotations(Icons.Sharp sharp) {
    }
}
