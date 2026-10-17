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
public final class GamesKt {
    private static ImageVector _games;

    public static final ImageVector getGames(Icons.Rounded rounded) {
        ImageVector imageVector = _games;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Games", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.0f, 7.29f, 15.0f, 3.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-4.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(4.29f);
        i.curveToRelative(0.0f, 0.13f, 0.05f, 0.26f, 0.15f, 0.35f);
        i.lineToRelative(2.5f, 2.5f);
        i.curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f);
        i.lineToRelative(2.5f, -2.5f);
        i.curveToRelative(0.09f, -0.09f, 0.14f, -0.21f, 0.14f, -0.35f);
        k4.r(i, 7.29f, 9.0f, 3.0f, 9.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(4.29f);
        i.curveToRelative(0.13f, 0.0f, 0.26f, -0.05f, 0.35f, -0.15f);
        i.lineToRelative(2.5f, -2.5f);
        i.curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f);
        i.lineToRelative(-2.5f, -2.5f);
        i.curveTo(7.55f, 9.05f, 7.43f, 9.0f, 7.29f, 9.0f);
        k4.r(i, 9.0f, 16.71f, 9.0f, 21.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(4.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-4.29f);
        i.curveToRelative(0.0f, -0.13f, -0.05f, -0.26f, -0.15f, -0.35f);
        i.lineToRelative(-2.5f, -2.5f);
        i.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        i.lineToRelative(-2.5f, 2.5f);
        i.curveToRelative(-0.09f, 0.09f, -0.14f, 0.21f, -0.14f, 0.35f);
        k4.x(i, 16.35f, 9.15f, -2.5f, 2.5f);
        i.curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(2.5f, 2.5f);
        i.curveToRelative(0.09f, 0.09f, 0.22f, 0.15f, 0.35f, 0.15f);
        i.lineTo(21.0f, 15.01f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        i.verticalLineToRelative(-4.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.horizontalLineToRelative(-4.29f);
        i.curveToRelative(-0.14f, -0.01f, -0.26f, 0.04f, -0.36f, 0.14f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _games = build;
        build.getClass();
        return build;
    }
}
