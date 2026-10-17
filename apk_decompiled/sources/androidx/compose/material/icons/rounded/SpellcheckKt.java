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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SpellcheckKt {
    private static ImageVector _spellcheck;

    public static final ImageVector getSpellcheck(Icons.Rounded rounded) {
        ImageVector imageVector = _spellcheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Spellcheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(13.12f, 16.0f);
        b.curveToRelative(0.69f, 0.0f, 1.15f, -0.69f, 0.9f, -1.32f);
        b.lineTo(9.77f, 3.87f);
        b.curveTo(9.56f, 3.34f, 9.06f, 3.0f, 8.5f, 3.0f);
        b.reflectiveCurveToRelative(-1.06f, 0.34f, -1.27f, 0.87f);
        b.lineTo(2.98f, 14.68f);
        b.curveToRelative(-0.25f, 0.63f, 0.22f, 1.32f, 0.9f, 1.32f);
        b.curveToRelative(0.4f, 0.0f, 0.76f, -0.25f, 0.91f, -0.63f);
        b.lineTo(5.67f, 13.0f);
        b.horizontalLineToRelative(5.64f);
        b.lineToRelative(0.9f, 2.38f);
        b.curveToRelative(0.15f, 0.37f, 0.51f, 0.62f, 0.91f, 0.62f);
        k4.r(b, 6.43f, 11.0f, 8.5f, 5.48f);
        r6.C(b, 10.57f, 11.0f, 6.43f, 11.0f);
        b.moveTo(20.89f, 12.29f);
        b.lineToRelative(-7.39f, 7.39f);
        b.lineToRelative(-2.97f, -2.97f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(3.68f, 3.68f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(8.08f, -8.09f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.curveToRelative(-0.38f, -0.39f, -1.02f, -0.39f, -1.4f, -0.01f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _spellcheck = build;
        build.getClass();
        return build;
    }
}
