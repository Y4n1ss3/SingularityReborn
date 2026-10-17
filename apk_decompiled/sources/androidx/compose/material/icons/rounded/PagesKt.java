package androidx.compose.material.icons.rounded;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PagesKt {
    private static ImageVector _pages;

    public static final ImageVector getPages(Icons.Rounded rounded) {
        ImageVector imageVector = _pages;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Pages", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(3.0f, 5.0f, 6.0f, 5.0f);
        m.lineToRelative(-0.6f, -2.38f);
        m.curveToRelative(-0.18f, -0.74f, 0.48f, -1.4f, 1.22f, -1.22f);
        m.lineTo(11.0f, 8.0f);
        m.lineTo(11.0f, 3.0f);
        m.lineTo(5.0f, 3.0f);
        m.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        k4.r(m, 8.0f, 13.0f, 3.0f, 13.0f);
        m.verticalLineToRelative(6.0f);
        m.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.p(m, 6.0f, -5.0f, -2.38f, 0.6f);
        m.curveToRelative(-0.73f, 0.18f, -1.4f, -0.48f, -1.21f, -1.21f);
        uo.l(m, 8.0f, 13.0f, 15.38f, 16.6f);
        af0.m(m, 13.0f, 16.0f, 5.0f, 6.0f);
        m.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        gy.C(m, -6.0f, -5.0f, 0.6f, 2.38f);
        m.curveToRelative(0.18f, 0.74f, -0.48f, 1.4f, -1.22f, 1.22f);
        r6.B(m, 19.0f, 3.0f, -6.0f, 5.0f);
        m.lineToRelative(2.38f, -0.6f);
        m.curveToRelative(0.73f, -0.18f, 1.4f, 0.48f, 1.21f, 1.21f);
        m.lineTo(16.0f, 11.0f);
        m.horizontalLineToRelative(5.0f);
        m.lineTo(21.0f, 5.0f);
        m.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        m.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, m.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pages = build;
        build.getClass();
        return build;
    }
}
