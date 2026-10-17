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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignVerticalTopKt {
    private static ImageVector _alignVerticalTop;

    public static final ImageVector getAlignVerticalTop(Icons.Rounded rounded) {
        ImageVector imageVector = _alignVerticalTop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AlignVerticalTop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 3.0f, 22.0f, 3.0f);
        i.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        i.horizontalLineTo(3.0f);
        i.curveTo(2.45f, 4.0f, 2.0f, 3.55f, 2.0f, 3.0f);
        i.verticalLineToRelative(0.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(18.0f);
        i.curveTo(21.55f, 2.0f, 22.0f, 2.45f, 22.0f, 3.0f);
        k4.r(i, 8.5f, 22.0f, 8.5f, 22.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.verticalLineToRelative(-13.0f);
        i.curveTo(10.0f, 6.67f, 9.33f, 6.0f, 8.5f, 6.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(7.67f, 6.0f, 7.0f, 6.67f, 7.0f, 7.5f);
        i.verticalLineToRelative(13.0f);
        i.curveTo(7.0f, 21.33f, 7.67f, 22.0f, 8.5f, 22.0f);
        k4.r(i, 15.5f, 16.0f, 15.5f, 16.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.verticalLineToRelative(-7.0f);
        i.curveTo(17.0f, 6.67f, 16.33f, 6.0f, 15.5f, 6.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveTo(14.67f, 6.0f, 14.0f, 6.67f, 14.0f, 7.5f);
        i.verticalLineToRelative(7.0f);
        i.curveTo(14.0f, 15.33f, 14.67f, 16.0f, 15.5f, 16.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignVerticalTop = build;
        build.getClass();
        return build;
    }
}
