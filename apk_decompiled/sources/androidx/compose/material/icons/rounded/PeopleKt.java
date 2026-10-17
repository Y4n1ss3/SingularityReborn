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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PeopleKt {
    private static ImageVector _people;

    public static final ImageVector getPeople(Icons.Rounded rounded) {
        ImageVector imageVector = _people;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.People", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 11.0f);
        b.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        b.reflectiveCurveTo(17.66f, 5.0f, 16.0f, 5.0f);
        b.reflectiveCurveToRelative(-3.0f, 1.34f, -3.0f, 3.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(8.0f, 11.0f);
        b.curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f);
        b.reflectiveCurveTo(9.66f, 5.0f, 8.0f, 5.0f);
        b.reflectiveCurveTo(5.0f, 6.34f, 5.0f, 8.0f);
        b.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        b.close();
        b.moveTo(8.0f, 13.0f);
        b.curveToRelative(-2.33f, 0.0f, -7.0f, 1.17f, -7.0f, 3.5f);
        b.lineTo(1.0f, 18.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        b.close();
        b.moveTo(16.0f, 13.0f);
        b.curveToRelative(-0.29f, 0.0f, -0.62f, 0.02f, -0.97f, 0.05f);
        b.curveToRelative(0.02f, 0.01f, 0.03f, 0.03f, 0.04f, 0.04f);
        b.curveToRelative(1.14f, 0.83f, 1.93f, 1.94f, 1.93f, 3.41f);
        b.lineTo(17.0f, 18.0f);
        b.curveToRelative(0.0f, 0.35f, -0.07f, 0.69f, -0.18f, 1.0f);
        b.lineTo(22.0f, 19.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.5f);
        b.curveToRelative(0.0f, -2.33f, -4.67f, -3.5f, -7.0f, -3.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _people = build;
        build.getClass();
        return build;
    }
}
