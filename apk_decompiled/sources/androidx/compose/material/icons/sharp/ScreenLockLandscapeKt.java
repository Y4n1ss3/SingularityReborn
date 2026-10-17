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
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenLockLandscapeKt {
    private static ImageVector _screenLockLandscape;

    public static final ImageVector getScreenLockLandscape(Icons.Sharp sharp) {
        ImageVector imageVector = _screenLockLandscape;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenLockLandscape", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(23.0f, 5.0f, 1.0f, 5.0f, 14.0f);
        gy.n(s, 22.0f, 23.0f, 5.0f);
        s.moveTo(19.0f, 17.0f);
        s.lineTo(5.0f, 17.0f);
        r6.m(s, 5.0f, 7.0f, 14.0f, 10.0f);
        k4.C(s, 9.0f, 16.0f, 6.0f, -5.0f);
        s.horizontalLineToRelative(-1.0f);
        s.verticalLineToRelative(-0.9f);
        s.curveToRelative(0.0f, -1.0f, -0.69f, -1.92f, -1.68f, -2.08f);
        s.curveTo(11.07f, 7.83f, 10.0f, 8.79f, 10.0f, 10.0f);
        bv.n(s, 1.0f, 9.0f, 11.0f, 5.0f);
        s.moveTo(10.8f, 10.0f);
        s.curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
        s.reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(s, 1.0f, -2.4f, -1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockLandscape = build;
        build.getClass();
        return build;
    }
}
