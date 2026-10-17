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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ScreenLockPortraitKt {
    private static ImageVector _screenLockPortrait;

    public static final ImageVector getScreenLockPortrait(Icons.Sharp sharp) {
        ImageVector imageVector = _screenLockPortrait;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ScreenLockPortrait", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(9.0f, 16.0f, 6.0f, -5.0f, -1.0f);
        n.verticalLineToRelative(-0.9f);
        n.curveToRelative(0.0f, -1.0f, -0.69f, -1.92f, -1.68f, -2.08f);
        n.curveTo(11.07f, 7.83f, 10.0f, 8.79f, 10.0f, 10.0f);
        bv.n(n, 1.0f, 9.0f, 11.0f, 5.0f);
        n.moveTo(10.8f, 10.0f);
        n.curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f);
        n.reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f);
        r6.p(n, 1.0f, -2.4f, -1.0f);
        n.moveTo(19.0f, 1.0f);
        af0.m(n, 5.0f, 1.0f, 22.0f, 14.0f);
        uo.l(n, 19.0f, 1.0f, 17.0f, 19.0f);
        n.lineTo(7.0f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(n, 7.0f, 5.0f, 10.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _screenLockPortrait = build;
        build.getClass();
        return build;
    }
}
