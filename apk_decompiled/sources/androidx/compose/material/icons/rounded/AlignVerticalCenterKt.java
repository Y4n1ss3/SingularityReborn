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
import defpackage.j50;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignVerticalCenterKt {
    private static ImageVector _alignVerticalCenter;

    public static final ImageVector getAlignVerticalCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _alignVerticalCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignVerticalCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(21.0f, 11.0f, -4.0f, 7.5f);
        e.curveTo(17.0f, 6.67f, 16.33f, 6.0f, 15.5f, 6.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(14.67f, 6.0f, 14.0f, 6.67f, 14.0f, 7.5f);
        uf.z(e, 11.0f, -4.0f, 4.5f);
        e.curveTo(10.0f, 3.67f, 9.33f, 3.0f, 8.5f, 3.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(7.67f, 3.0f, 7.0f, 3.67f, 7.0f, 4.5f);
        e.verticalLineTo(11.0f);
        e.horizontalLineTo(2.84f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineTo(7.0f);
        e.verticalLineToRelative(6.5f);
        e.curveTo(7.0f, 20.33f, 7.67f, 21.0f, 8.5f, 21.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        kf0.r(e, 13.0f, 4.0f, 3.5f);
        e.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        e.verticalLineTo(13.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(22.0f, 11.45f, 21.55f, 11.0f, 21.0f, 11.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignVerticalCenter = build;
        build.getClass();
        return build;
    }
}
