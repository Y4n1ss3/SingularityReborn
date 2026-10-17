package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AdfScannerKt {
    private static ImageVector _adfScanner;

    public static final ImageVector getAdfScanner(Icons.Filled filled) {
        ImageVector imageVector = _adfScanner;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AdfScanner", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder v = uo.v(19.0f, 12.0f, -1.0f, 4.0f, 6.0f);
        v.verticalLineToRelative(8.0f);
        v.horizontalLineTo(5.0f);
        v.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        kf0.z(v, 5.0f, 20.0f, -5.0f);
        v.curveTo(22.0f, 13.34f, 20.66f, 12.0f, 19.0f, 12.0f);
        c21.d(v, 16.0f, 12.0f, 8.0f, 6.0f);
        uo.r(v, 8.0f, 12.0f, 18.0f, 17.0f);
        v.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        v.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        v.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        v.curveTo(19.0f, 16.55f, 18.55f, 17.0f, 18.0f, 17.0f);
        v.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, v.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _adfScanner = build;
        build.getClass();
        return build;
    }
}
