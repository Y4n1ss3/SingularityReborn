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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HeartBrokenKt {
    private static ImageVector _heartBroken;

    public static final ImageVector getHeartBroken(Icons.Rounded rounded) {
        ImageVector imageVector = _heartBroken;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HeartBroken", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.57f, 3.95f);
        b.curveToRelative(-1.92f, -1.29f, -4.08f, -1.17f, -5.8f, -0.26f);
        b.lineTo(12.0f, 9.0f);
        b.horizontalLineToRelative(1.66f);
        b.curveToRelative(0.67f, 0.0f, 1.15f, 0.65f, 0.96f, 1.29f);
        b.lineToRelative(-1.82f, 6.07f);
        b.curveToRelative(-0.09f, 0.29f, -0.52f, 0.2f, -0.49f, -0.1f);
        b.lineTo(13.0f, 10.0f);
        b.horizontalLineToRelative(-1.67f);
        b.curveToRelative(-0.66f, 0.0f, -1.14f, -0.64f, -0.96f, -1.27f);
        b.lineToRelative(1.18f, -4.11f);
        b.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        b.curveTo(9.7f, 2.89f, 6.71f, 2.32f, 4.27f, 4.04f);
        b.curveTo(2.82f, 5.07f, 2.0f, 6.7f, 2.0f, 8.49f);
        b.curveToRelative(-0.01f, 3.81f, 3.53f, 6.71f, 8.66f, 11.3f);
        b.curveToRelative(0.76f, 0.68f, 1.92f, 0.69f, 2.69f, 0.01f);
        b.curveToRelative(4.98f, -4.42f, 8.87f, -7.58f, 8.64f, -11.62f);
        b.curveTo(21.9f, 6.45f, 21.0f, 4.92f, 19.57f, 3.95f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _heartBroken = build;
        build.getClass();
        return build;
    }
}
