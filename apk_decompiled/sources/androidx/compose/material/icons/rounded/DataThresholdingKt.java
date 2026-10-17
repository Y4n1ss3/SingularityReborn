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
import defpackage.af0;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataThresholdingKt {
    private static ImageVector _dataThresholding;

    public static final ImageVector getDataThresholding(Icons.Rounded rounded) {
        ImageVector imageVector = _dataThresholding;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DataThresholding", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        k4.x(d, 11.38f, 8.88f, 1.29f, 1.29f);
        d.lineToRelative(2.96f, -2.96f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        d.lineToRelative(-3.67f, 3.67f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineTo(10.67f, 11.0f);
        d.lineToRelative(-2.3f, 2.3f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineToRelative(0.0f, 0.0f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.lineToRelative(3.0f, -3.0f);
        d.curveTo(10.35f, 8.48f, 10.98f, 8.48f, 11.38f, 8.88f);
        af0.l(d, 5.0f, 16.0f, 1.72f);
        uf.o(d, 5.0f, 17.72f, 16.0f);
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
