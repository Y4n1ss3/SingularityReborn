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
import defpackage.bv;
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PanToolKt {
    private static ImageVector _panTool;

    public static final ImageVector getPanTool(Icons.Filled filled) {
        ImageVector imageVector = _panTool;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PanTool", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(23.0f, 5.5f, 20.0f);
        d.curveToRelative(0.0f, 2.2f, -1.8f, 4.0f, -4.0f, 4.0f);
        d.horizontalLineToRelative(-7.3f);
        d.curveToRelative(-1.08f, 0.0f, -2.1f, -0.43f, -2.85f, -1.19f);
        d.lineTo(1.0f, 14.83f);
        d.curveToRelative(0.0f, 0.0f, 1.26f, -1.23f, 1.3f, -1.25f);
        d.curveToRelative(0.22f, -0.19f, 0.49f, -0.29f, 0.79f, -0.29f);
        d.curveToRelative(0.22f, 0.0f, 0.42f, 0.06f, 0.6f, 0.16f);
        d.curveTo(3.73f, 13.46f, 8.0f, 15.91f, 8.0f, 15.91f);
        d.verticalLineTo(4.0f);
        d.curveToRelative(0.0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f);
        d.reflectiveCurveTo(11.0f, 3.17f, 11.0f, 4.0f);
        bv.x(d, 7.0f, 1.0f, 1.5f);
        d.curveTo(12.0f, 0.67f, 12.67f, 0.0f, 13.5f, 0.0f);
        d.reflectiveCurveTo(15.0f, 0.67f, 15.0f, 1.5f);
        uf.z(d, 11.0f, 1.0f, 2.5f);
        d.curveTo(16.0f, 1.67f, 16.67f, 1.0f, 17.5f, 1.0f);
        d.reflectiveCurveTo(19.0f, 1.67f, 19.0f, 2.5f);
        uf.z(d, 11.0f, 1.0f, 5.5f);
        d.curveTo(20.0f, 4.67f, 20.67f, 4.0f, 21.5f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(d, 23.0f, 4.67f, 23.0f, 5.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _panTool = build;
        build.getClass();
        return build;
    }
}
