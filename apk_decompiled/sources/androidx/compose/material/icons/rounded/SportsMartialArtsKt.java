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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsMartialArtsKt {
    private static ImageVector _sportsMartialArts;

    public static final ImageVector getSportsMartialArts(Icons.Rounded rounded) {
        ImageVector imageVector = _sportsMartialArts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SportsMartialArts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(19.06f, 2.6f, 11.6f, 8.7f);
        i.lineToRelative(-1.21f, -1.04f);
        i.lineToRelative(2.48f, -1.43f);
        i.curveToRelative(0.57f, -0.33f, 0.67f, -1.11f, 0.21f, -1.57f);
        i.lineToRelative(-2.95f, -2.95f);
        i.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        i.lineToRelative(2.03f, 2.03f);
        i.lineTo(5.35f, 8.26f);
        i.curveToRelative(-0.23f, 0.13f, -0.39f, 0.35f, -0.46f, 0.6f);
        i.lineToRelative(-0.96f, 3.49f);
        i.curveToRelative(-0.07f, 0.26f, -0.04f, 0.53f, 0.1f, 0.77f);
        i.lineToRelative(1.74f, 3.02f);
        i.curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.37f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.37f, -1.37f);
        i.lineToRelative(-1.53f, -2.66f);
        i.lineToRelative(0.36f, -1.29f);
        i.lineTo(9.5f, 13.0f);
        i.lineToRelative(0.44f, 8.0f);
        i.curveToRelative(0.03f, 0.56f, 0.49f, 1.0f, 1.05f, 1.0f);
        i.horizontalLineToRelative(0.0f);
        i.curveToRelative(0.56f, 0.0f, 1.02f, -0.44f, 1.05f, -1.0f);
        i.lineToRelative(0.45f, -9.0f);
        i.lineToRelative(7.87f, -7.96f);
        i.curveToRelative(0.36f, -0.36f, 0.38f, -0.93f, 0.05f, -1.32f);
        i.lineToRelative(0.0f, 0.0f);
        i.curveTo(20.07f, 2.32f, 19.47f, 2.27f, 19.06f, 2.6f);
        i.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(5.0f, 5.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsMartialArts = build;
        build.getClass();
        return build;
    }
}
