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
import defpackage.af0;
import defpackage.fc;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BedroomBabyKt {
    private static ImageVector _bedroomBaby;

    public static final ImageVector getBedroomBaby(Icons.Outlined outlined) {
        ImageVector imageVector = _bedroomBaby;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.BedroomBaby", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.94f, 14.04f);
        b.curveToRelative(-0.34f, 0.34f, -0.71f, 0.64f, -1.1f, 0.92f);
        fc.t(b, 16.0f, 13.5f, 11.0f, 1.0f);
        uo.B(b, -1.0f, -5.62f, 9.65f, 7.0f);
        b.horizontalLineTo(6.0f);
        b.lineToRelative(1.0f, 0.76f);
        b.lineTo(5.5f, 9.5f);
        b.lineToRelative(0.95f, 1.0f);
        b.lineTo(8.0f, 9.51f);
        b.verticalLineToRelative(3.99f);
        b.lineToRelative(-0.84f, 1.46f);
        b.curveToRelative(-0.39f, -0.27f, -0.76f, -0.58f, -1.1f, -0.92f);
        b.lineTo(5.0f, 15.1f);
        b.curveToRelative(1.87f, 1.87f, 4.36f, 2.9f, 7.0f, 2.9f);
        b.reflectiveCurveToRelative(5.13f, -1.03f, 7.0f, -2.9f);
        uo.l(b, 17.94f, 14.04f, 8.45f, 15.71f);
        b.lineToRelative(0.03f, -0.06f);
        b.lineToRelative(0.81f, -1.41f);
        b.curveToRelative(1.74f, 0.65f, 3.66f, 0.65f, 5.4f, 0.0f);
        b.lineToRelative(0.81f, 1.41f);
        b.lineToRelative(0.03f, 0.06f);
        b.curveToRelative(-1.1f, 0.51f, -2.3f, 0.79f, -3.55f, 0.79f);
        b.reflectiveCurveTo(9.55f, 16.23f, 8.45f, 15.71f);
        af0.A(b, 20.0f, 4.0f, 16.0f, 4.0f);
        b.verticalLineTo(4.0f);
        b.horizontalLineTo(20.0f);
        b.moveTo(20.0f, 2.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        b.verticalLineToRelative(16.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(4.0f);
        b.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bedroomBaby = build;
        build.getClass();
        return build;
    }
}
