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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPlayKt {
    private static ImageVector _localPlay;

    public static final ImageVector getLocalPlay(Icons.Rounded rounded) {
        ImageVector imageVector = _localPlay;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalPlay", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 12.0f);
        b.curveToRelative(0.0f, -0.76f, 0.43f, -1.42f, 1.06f, -1.76f);
        b.curveToRelative(0.6f, -0.33f, 0.94f, -1.01f, 0.94f, -1.7f);
        b.lineTo(22.0f, 6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.lineTo(4.0f, 4.0f);
        b.curveToRelative(-1.1f, 0.0f, -1.99f, 0.89f, -1.99f, 1.99f);
        b.verticalLineToRelative(2.55f);
        b.curveToRelative(0.0f, 0.69f, 0.33f, 1.37f, 0.94f, 1.69f);
        b.curveTo(3.58f, 10.58f, 4.0f, 11.24f, 4.0f, 12.0f);
        b.reflectiveCurveToRelative(-0.43f, 1.43f, -1.06f, 1.76f);
        b.curveToRelative(-0.6f, 0.33f, -0.94f, 1.01f, -0.94f, 1.7f);
        b.verticalLineToRelative(2.25f);
        b.curveTo(2.0f, 19.1f, 2.9f, 20.0f, 4.0f, 20.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-2.54f);
        b.curveToRelative(0.0f, -0.69f, -0.34f, -1.37f, -0.94f, -1.7f);
        b.curveToRelative(-0.63f, -0.34f, -1.06f, -1.0f, -1.06f, -1.76f);
        k4.r(b, 14.5f, 16.1f, 12.0f, 14.5f);
        b.lineToRelative(-2.5f, 1.61f);
        b.curveToRelative(-0.38f, 0.24f, -0.87f, -0.11f, -0.75f, -0.55f);
        b.lineToRelative(0.75f, -2.88f);
        b.lineToRelative(-2.3f, -1.88f);
        b.curveToRelative(-0.35f, -0.29f, -0.17f, -0.86f, 0.29f, -0.89f);
        b.lineToRelative(2.96f, -0.17f);
        b.lineToRelative(1.08f, -2.75f);
        b.curveToRelative(0.17f, -0.42f, 0.77f, -0.42f, 0.93f, 0.0f);
        b.lineToRelative(1.08f, 2.76f);
        b.lineToRelative(2.96f, 0.17f);
        b.curveToRelative(0.45f, 0.03f, 0.64f, 0.6f, 0.29f, 0.89f);
        b.lineToRelative(-2.3f, 1.88f);
        b.lineToRelative(0.76f, 2.86f);
        b.curveToRelative(0.12f, 0.45f, -0.37f, 0.8f, -0.75f, 0.55f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPlay = build;
        build.getClass();
        return build;
    }
}
