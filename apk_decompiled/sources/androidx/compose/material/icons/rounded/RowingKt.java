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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RowingKt {
    private static ImageVector _rowing;

    public static final ImageVector getRowing(Icons.Rounded rounded) {
        ImageVector imageVector = _rowing;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Rowing", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.75f, 18.25f);
        b.curveToRelative(-0.41f, 0.41f, -0.41f, 1.09f, 0.0f, 1.5f);
        b.curveToRelative(0.41f, 0.41f, 1.09f, 0.41f, 1.5f, 0.0f);
        b.lineTo(9.0f, 17.0f);
        b.horizontalLineToRelative(2.0f);
        fc.C(b, -2.5f, -2.5f, -3.75f, 3.75f);
        b.moveTo(15.0f, 5.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        k4.x(b, 20.29f, 20.3f, -2.0f, -2.01f);
        b.curveToRelative(-0.18f, -0.18f, -0.44f, -0.29f, -0.71f, -0.29f);
        b.lineTo(16.5f, 18.0f);
        b.lineToRelative(-6.29f, -6.29f);
        b.curveToRelative(0.79f, -0.33f, 1.66f, -0.87f, 2.29f, -1.39f);
        b.verticalLineToRelative(2.27f);
        b.lineToRelative(3.58f, 3.58f);
        b.curveToRelative(0.57f, -0.55f, 0.92f, -1.32f, 0.92f, -2.16f);
        b.lineTo(17.0f, 8.26f);
        b.curveTo(17.0f, 7.02f, 15.98f, 6.0f, 14.74f, 6.0f);
        b.horizontalLineToRelative(-0.02f);
        b.curveToRelative(-0.34f, 0.0f, -0.67f, 0.09f, -0.96f, 0.23f);
        b.curveToRelative(-0.26f, 0.12f, -0.5f, 0.29f, -0.69f, 0.5f);
        b.lineToRelative(-1.4f, 1.55f);
        b.curveTo(10.61f, 9.45f, 8.66f, 10.35f, 7.0f, 10.32f);
        b.curveToRelative(-0.6f, 0.0f, -1.08f, 0.48f, -1.08f, 1.08f);
        b.curveToRelative(0.0f, 0.6f, 0.48f, 1.08f, 1.08f, 1.08f);
        b.curveToRelative(0.31f, 0.0f, 0.61f, -0.03f, 0.9f, -0.07f);
        b.lineToRelative(7.11f, 7.09f);
        b.verticalLineToRelative(1.08f);
        b.curveToRelative(0.0f, 0.26f, 0.1f, 0.52f, 0.29f, 0.7f);
        b.lineToRelative(1.99f, 2.01f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.42f, 0.0f);
        b.lineToRelative(1.58f, -1.58f);
        b.curveToRelative(0.39f, -0.38f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _rowing = build;
        build.getClass();
        return build;
    }
}
