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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CloudSyncKt {
    private static ImageVector _cloudSync;

    public static final ImageVector getCloudSync(Icons.Rounded rounded) {
        ImageVector imageVector = _cloudSync;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.CloudSync", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(24.0f, 17.48f);
        b.curveToRelative(0.0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f);
        b.lineTo(15.0f, 20.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.curveToRelative(0.0f, -1.6f, 1.26f, -2.9f, 2.84f, -2.98f);
        b.curveTo(15.4f, 12.83f, 16.6f, 12.0f, 18.0f, 12.0f);
        b.curveToRelative(1.76f, 0.0f, 3.2f, 1.3f, 3.45f, 2.99f);
        b.curveToRelative(0.02f, 0.0f, 0.03f, -0.01f, 0.05f, -0.01f);
        b.curveTo(22.88f, 14.98f, 24.0f, 16.1f, 24.0f, 17.48f);
        b.close();
        b.moveTo(10.0f, 15.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.44f);
        b.curveToRelative(-1.22f, -1.1f, -2.0f, -2.67f, -2.0f, -4.44f);
        b.curveToRelative(0.0f, -2.38f, 1.39f, -4.43f, 3.4f, -5.4f);
        b.curveTo(9.77f, 6.42f, 10.0f, 6.04f, 10.0f, 5.63f);
        b.curveToRelative(0.0f, -0.71f, -0.73f, -1.18f, -1.37f, -0.88f);
        b.curveTo(5.89f, 6.03f, 4.0f, 8.79f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, 2.4f, 1.06f, 4.54f, 2.73f, 6.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        bv.t(b, 15.0f, 19.0f, 6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(7.56f);
        b.curveToRelative(0.98f, 0.89f, 1.68f, 2.08f, 1.92f, 3.44f);
        b.lineToRelative(2.02f, 0.0f);
        b.curveToRelative(-0.25f, -1.99f, -1.23f, -3.74f, -2.66f, -5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _cloudSync = build;
        build.getClass();
        return build;
    }
}
