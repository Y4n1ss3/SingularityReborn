package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FactCheckKt {
    private static ImageVector _factCheck;

    public static final ImageVector getFactCheck(Icons.Rounded rounded) {
        ImageVector imageVector = _factCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.FactCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int m5057getEvenOddRgk1Os = PathFillType.Companion.m5057getEvenOddRgk1Os();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 3.0f, 4.0f);
        d.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(22.0f, 3.9f, 21.1f, 3.0f, 20.0f, 3.0f);
        r6.g(d, 9.0f, 17.0f, 6.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.curveTo(10.0f, 16.55f, 9.55f, 17.0f, 9.0f, 17.0f);
        r6.g(d, 9.0f, 13.0f, 6.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.curveTo(10.0f, 12.55f, 9.55f, 13.0f, 9.0f, 13.0f);
        r6.g(d, 9.0f, 9.0f, 6.0f);
        d.curveTo(5.45f, 9.0f, 5.0f, 8.55f, 5.0f, 8.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.curveTo(10.0f, 8.55f, 9.55f, 9.0f, 9.0f, 9.0f);
        k4.x(d, 18.7f, 11.12f, -3.17f, 3.17f);
        d.curveToRelative(-0.39f, 0.39f, -1.03f, 0.39f, -1.42f, 0.0f);
        d.lineToRelative(-1.41f, -1.42f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(0.71f, 0.71f);
        d.lineToRelative(2.47f, -2.47f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(0.01f, 0.01f);
        d.curveTo(19.09f, 10.1f, 19.09f, 10.74f, 18.7f, 11.12f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), m5057getEvenOddRgk1Os, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _factCheck = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getFactCheck$annotations(Icons.Rounded rounded) {
    }
}
