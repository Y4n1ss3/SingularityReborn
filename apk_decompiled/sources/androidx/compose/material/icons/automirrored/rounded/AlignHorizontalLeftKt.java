package androidx.compose.material.icons.automirrored.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AlignHorizontalLeftKt {
    private static ImageVector _alignHorizontalLeft;

    public static final ImageVector getAlignHorizontalLeft(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _alignHorizontalLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.AlignHorizontalLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(3.0f, 22.0f, 3.0f, 22.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        i.verticalLineTo(3.0f);
        i.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        i.verticalLineToRelative(18.0f);
        i.curveTo(4.0f, 21.55f, 3.55f, 22.0f, 3.0f, 22.0f);
        af0.l(i, 20.5f, 7.0f, -13.0f);
        i.curveTo(6.67f, 7.0f, 6.0f, 7.67f, 6.0f, 8.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(6.0f, 9.33f, 6.67f, 10.0f, 7.5f, 10.0f);
        i.horizontalLineToRelative(13.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(22.0f, 7.67f, 21.33f, 7.0f, 20.5f, 7.0f);
        af0.l(i, 14.5f, 14.0f, -7.0f);
        i.curveTo(6.67f, 14.0f, 6.0f, 14.67f, 6.0f, 15.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(6.0f, 16.33f, 6.67f, 17.0f, 7.5f, 17.0f);
        i.horizontalLineToRelative(7.0f);
        i.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        i.verticalLineToRelative(0.0f);
        i.curveTo(16.0f, 14.67f, 15.33f, 14.0f, 14.5f, 14.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _alignHorizontalLeft = build;
        build.getClass();
        return build;
    }
}
