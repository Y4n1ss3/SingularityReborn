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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WebAssetOffKt {
    private static ImageVector _webAssetOff;

    public static final ImageVector getWebAssetOff(Icons.Rounded rounded) {
        ImageVector imageVector = _webAssetOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WebAssetOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(6.83f, 4.0f, 20.0f);
        d.curveToRelative(1.11f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 0.34f, -0.09f, 0.66f, -0.23f, 0.94f);
        fc.t(d, 20.0f, 17.17f, 8.0f, -9.17f);
        uo.l(d, 6.83f, 4.0f, 19.78f, 22.61f);
        d.lineTo(17.17f, 20.0f);
        d.horizontalLineTo(4.0f);
        d.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -0.34f, 0.08f, -0.66f, 0.23f, -0.94f);
        d.lineTo(1.39f, 4.22f);
        d.curveTo(1.0f, 3.83f, 1.0f, 3.2f, 1.39f, 2.81f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(18.38f, 18.38f);
        d.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveTo(20.8f, 23.0f, 20.17f, 23.0f, 19.78f, 22.61f);
        k4.x(d, 15.17f, 18.0f, -10.0f, -10.0f);
        d.horizontalLineTo(4.0f);
        d.verticalLineToRelative(10.0f);
        d.horizontalLineTo(15.17f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _webAssetOff = build;
        build.getClass();
        return build;
    }
}
