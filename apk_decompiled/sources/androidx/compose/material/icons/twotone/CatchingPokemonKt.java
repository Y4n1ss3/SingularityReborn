package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CatchingPokemonKt {
    private static ImageVector _catchingPokemon;

    public static final ImageVector getCatchingPokemon(Icons.TwoTone twoTone) {
        ImageVector imageVector = _catchingPokemon;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CatchingPokemon", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 4.0f);
        b.curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f);
        b.horizontalLineToRelative(-4.06f);
        b.curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f);
        b.horizontalLineTo(4.06f);
        b.curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 2.0f);
        b2.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b2.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b2.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b2.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b2.close();
        b2.moveTo(12.0f, 4.0f);
        b2.curveToRelative(4.08f, 0.0f, 7.45f, 3.05f, 7.94f, 7.0f);
        b2.horizontalLineToRelative(-4.06f);
        b2.curveTo(15.43f, 9.27f, 13.86f, 8.0f, 12.0f, 8.0f);
        b2.reflectiveCurveToRelative(-3.43f, 1.27f, -3.87f, 3.0f);
        b2.horizontalLineTo(4.06f);
        b2.curveTo(4.55f, 7.05f, 7.92f, 4.0f, 12.0f, 4.0f);
        b2.close();
        b2.moveTo(14.0f, 12.0f);
        b2.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveTo(14.0f, 10.9f, 14.0f, 12.0f);
        b2.close();
        b2.moveTo(12.0f, 20.0f);
        b2.curveToRelative(-4.08f, 0.0f, -7.45f, -3.05f, -7.94f, -7.0f);
        b2.horizontalLineToRelative(4.06f);
        b2.curveToRelative(0.44f, 1.73f, 2.01f, 3.0f, 3.87f, 3.0f);
        b2.reflectiveCurveToRelative(3.43f, -1.27f, 3.87f, -3.0f);
        b2.horizontalLineToRelative(4.06f);
        b2.curveTo(19.45f, 16.95f, 16.08f, 20.0f, 12.0f, 20.0f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _catchingPokemon = build;
        build.getClass();
        return build;
    }
}
