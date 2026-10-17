package androidx.compose.material.icons.outlined;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AccountCircleKt {
    private static ImageVector _accountCircle;

    public static final ImageVector getAccountCircle(Icons.Outlined outlined) {
        ImageVector imageVector = _accountCircle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AccountCircle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(7.35f, 18.5f);
        b.curveTo(8.66f, 17.56f, 10.26f, 17.0f, 12.0f, 17.0f);
        b.reflectiveCurveToRelative(3.34f, 0.56f, 4.65f, 1.5f);
        b.curveTo(15.34f, 19.44f, 13.74f, 20.0f, 12.0f, 20.0f);
        b.reflectiveCurveTo(8.66f, 19.44f, 7.35f, 18.5f);
        k4.r(b, 18.14f, 17.12f, 18.14f, 17.12f);
        b.curveTo(16.45f, 15.8f, 14.32f, 15.0f, 12.0f, 15.0f);
        b.reflectiveCurveToRelative(-4.45f, 0.8f, -6.14f, 2.12f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveTo(4.7f, 15.73f, 4.0f, 13.95f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.curveTo(20.0f, 13.95f, 19.3f, 15.73f, 18.14f, 17.12f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 6.0f);
        b2.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b2.reflectiveCurveTo(10.07f, 13.0f, 12.0f, 13.0f);
        b2.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b2.reflectiveCurveTo(13.93f, 6.0f, 12.0f, 6.0f);
        b2.close();
        b2.moveTo(12.0f, 11.0f);
        b2.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b2.reflectiveCurveTo(11.17f, 8.0f, 12.0f, 8.0f);
        b2.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b2, 12.83f, 11.0f, 12.0f, 11.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _accountCircle = build;
        build.getClass();
        return build;
    }
}
