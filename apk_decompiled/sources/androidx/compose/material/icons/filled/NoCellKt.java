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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NoCellKt {
    private static ImageVector _noCell;

    public static final ImageVector getNoCell(Icons.Filled filled) {
        ImageVector imageVector = _noCell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.NoCell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(8.83f, 6.0f, -3.7f, -3.7f);
        e.curveTo(5.42f, 1.55f, 6.15f, 1.0f, 7.0f, 1.0f);
        e.lineToRelative(10.0f, 0.01f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.89f, 2.0f, 1.99f);
        k4.z(e, 13.17f, -2.0f, -2.0f, 6.0f);
        k4.w(e, 8.83f, 19.78f, 22.61f);
        e.lineToRelative(-0.91f, -0.91f);
        e.curveTo(18.58f, 22.45f, 17.85f, 23.0f, 17.0f, 23.0f);
        e.horizontalLineTo(7.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(7.83f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(1.41f, -1.41f);
        gy.B(e, 18.38f, 18.38f, 19.78f, 22.61f);
        e.moveTo(15.17f, 18.0f);
        e.lineTo(7.0f, 9.83f);
        e.verticalLineTo(18.0f);
        e.horizontalLineTo(15.17f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _noCell = build;
        build.getClass();
        return build;
    }
}
