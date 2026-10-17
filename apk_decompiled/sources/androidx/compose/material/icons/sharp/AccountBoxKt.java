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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountBoxKt {
    private static ImageVector _accountBox;

    public static final ImageVector getAccountBox(Icons.Sharp sharp) {
        ImageVector imageVector = _accountBox;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AccountBox", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = r6.i(21.0f, 3.0f, 3.0f, 18.0f, 18.0f);
        bv.t(i, 3.0f, 12.0f, 6.0f);
        i.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        i.curveToRelative(0.0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f);
        i.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        i.curveTo(8.5f, 7.57f, 10.07f, 6.0f, 12.0f, 6.0f);
        uo.q(i, 19.0f, 19.0f, 5.0f, -0.23f);
        i.curveToRelative(0.0f, -0.62f, 0.28f, -1.2f, 0.76f, -1.58f);
        i.curveTo(7.47f, 15.82f, 9.64f, 15.0f, 12.0f, 15.0f);
        i.reflectiveCurveToRelative(4.53f, 0.82f, 6.24f, 2.19f);
        i.curveToRelative(0.48f, 0.38f, 0.76f, 0.97f, 0.76f, 1.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(i, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountBox = build;
        build.getClass();
        return build;
    }
}
