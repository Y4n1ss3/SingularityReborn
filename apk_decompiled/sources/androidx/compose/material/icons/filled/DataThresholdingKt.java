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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Filled filled) {
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DataThresholding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        k4.x(d, 10.67f, 8.17f, 2.0f, 2.0f);
        d.lineToRelative(3.67f, -3.67f);
        d.lineToRelative(1.41f, 1.41f);
        d.lineTo(12.67f, 13.0f);
        d.lineToRelative(-2.0f, -2.0f);
        d.lineToRelative(-3.0f, 3.0f);
        gy.B(d, -1.41f, -1.41f, 10.67f, 8.17f);
        d.moveTo(5.0f, 16.0f);
        d.horizontalLineToRelative(1.72f);
        d.lineTo(5.0f, 17.72f);
        d.verticalLineTo(16.0f);
        d.close();
        d.moveTo(5.84f, 19.0f);
        d.lineToRelative(3.0f, -3.0f);
        uf.A(d, 1.83f, -3.0f, 3.0f, 5.84f);
        d.moveTo(9.8f, 19.0f);
        d.lineToRelative(3.0f, -3.0f);
        uf.A(d, 1.62f, -3.0f, 3.0f, 9.8f);
        d.moveTo(13.53f, 19.0f);
        d.lineToRelative(3.0f, -3.0f);
        uf.A(d, 1.62f, -3.0f, 3.0f, 13.53f);
        d.moveTo(19.0f, 19.0f);
        d.horizontalLineToRelative(-1.73f);
        d.lineTo(19.0f, 17.27f);
        d.verticalLineTo(19.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataThresholding = build;
        build.getClass();
        return build;
    }
}
