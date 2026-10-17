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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignHorizontalCenterKt {
    private static ImageVector _alignHorizontalCenter;

    public static final ImageVector getAlignHorizontalCenter(Icons.Rounded rounded) {
        ImageVector imageVector = _alignHorizontalCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignHorizontalCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(12.0f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(4.0f);
        i.lineToRelative(6.5f, 0.0f);
        i.curveTo(20.33f, 7.0f, 21.0f, 7.67f, 21.0f, 8.5f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        af0.u(i, 13.0f, 4.0f, 3.5f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, 0.67f, 1.5f, 1.5f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f);
        i.horizontalLineTo(13.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineToRelative(-4.0f);
        i.horizontalLineTo(7.5f);
        i.curveTo(6.67f, 17.0f, 6.0f, 16.33f, 6.0f, 15.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(6.0f, 14.67f, 6.67f, 14.0f, 7.5f, 14.0f);
        r6.y(i, 11.0f, -4.0f, 4.5f);
        i.curveTo(3.67f, 10.0f, 3.0f, 9.33f, 3.0f, 8.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(3.0f, 7.67f, 3.67f, 7.0f, 4.5f, 7.0f);
        i.horizontalLineTo(11.0f);
        i.lineToRelative(0.0f, -4.0f);
        i.curveTo(11.0f, 2.45f, 11.45f, 2.0f, 12.0f, 2.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignHorizontalCenter = build;
        build.getClass();
        return build;
    }
}
