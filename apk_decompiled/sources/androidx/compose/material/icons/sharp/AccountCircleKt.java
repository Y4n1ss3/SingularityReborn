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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountCircleKt {
    private static ImageVector _accountCircle;

    public static final ImageVector getAccountCircle(Icons.Sharp sharp) {
        ImageVector imageVector = _accountCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AccountCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(12.0f, 6.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        b.reflectiveCurveTo(13.93f, 13.0f, 12.0f, 13.0f);
        b.reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f);
        b.reflectiveCurveTo(10.07f, 6.0f, 12.0f, 6.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-2.03f, 0.0f, -4.43f, -0.82f, -6.14f, -2.88f);
        b.curveTo(7.55f, 15.8f, 9.68f, 15.0f, 12.0f, 15.0f);
        b.reflectiveCurveToRelative(4.45f, 0.8f, 6.14f, 2.12f);
        b.curveTo(16.43f, 19.18f, 14.03f, 20.0f, 12.0f, 20.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountCircle = build;
        build.getClass();
        return build;
    }
}
