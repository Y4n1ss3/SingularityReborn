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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class UnsubscribeKt {
    private static ImageVector _unsubscribe;

    public static final ImageVector getUnsubscribe(Icons.Rounded rounded) {
        ImageVector imageVector = _unsubscribe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Unsubscribe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.5f, 11.5f);
        b.curveToRelative(0.92f, 0.0f, 1.75f, 0.26f, 2.49f, 0.69f);
        b.lineTo(20.99f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.89f, -2.0f, -1.99f, -2.0f);
        b.lineTo(5.0f, 3.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(10.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(8.55f);
        b.curveToRelative(-0.02f, -0.17f, -0.05f, -0.33f, -0.05f, -0.5f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.close();
        b.moveTo(12.89f, 10.05f);
        b.curveToRelative(-0.56f, 0.28f, -1.23f, 0.28f, -1.79f, 0.0f);
        b.lineToRelative(-5.61f, -2.8f);
        b.curveToRelative(-0.3f, -0.15f, -0.49f, -0.46f, -0.49f, -0.8f);
        b.curveToRelative(0.0f, -0.66f, 0.7f, -1.1f, 1.29f, -0.8f);
        b.lineTo(12.0f, 8.5f);
        b.lineToRelative(5.71f, -2.85f);
        b.curveToRelative(0.59f, -0.3f, 1.29f, 0.13f, 1.29f, 0.8f);
        b.curveToRelative(0.0f, 0.34f, -0.19f, 0.65f, -0.49f, 0.8f);
        fc.B(b, -5.62f, 2.8f, 18.5f, 13.0f);
        b.curveToRelative(-1.93f, 0.0f, -3.5f, 1.57f, -3.5f, 3.5f);
        b.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b.reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f);
        b.close();
        b.moveTo(20.5f, 16.5f);
        b.curveToRelative(0.0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f);
        b.horizontalLineToRelative(-3.0f);
        b.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        b.reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _unsubscribe = build;
        build.getClass();
        return build;
    }
}
