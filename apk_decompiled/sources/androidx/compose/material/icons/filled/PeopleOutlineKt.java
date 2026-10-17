package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.fc;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PeopleOutlineKt {
    private static ImageVector _peopleOutline;

    public static final ImageVector getPeopleOutline(Icons.Filled filled) {
        ImageVector imageVector = _peopleOutline;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.PeopleOutline", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.5f, 13.0f);
        b.curveToRelative(-1.2f, 0.0f, -3.07f, 0.34f, -4.5f, 1.0f);
        b.curveToRelative(-1.43f, -0.67f, -3.3f, -1.0f, -4.5f, -1.0f);
        b.curveTo(5.33f, 13.0f, 1.0f, 14.08f, 1.0f, 16.25f);
        fc.w(b, 1.0f, 19.0f, 22.0f, -2.75f);
        b.curveToRelative(0.0f, -2.17f, -4.33f, -3.25f, -6.5f, -3.25f);
        r6.B(b, 12.5f, 17.5f, -10.0f, -1.25f);
        b.curveToRelative(0.0f, -0.54f, 2.56f, -1.75f, 5.0f, -1.75f);
        b.reflectiveCurveToRelative(5.0f, 1.21f, 5.0f, 1.75f);
        r6.l(b, 1.25f, 21.5f, 17.5f);
        b.lineTo(14.0f, 17.5f);
        b.verticalLineToRelative(-1.25f);
        b.curveToRelative(0.0f, -0.46f, -0.2f, -0.86f, -0.52f, -1.22f);
        b.curveToRelative(0.88f, -0.3f, 1.96f, -0.53f, 3.02f, -0.53f);
        b.curveToRelative(2.44f, 0.0f, 5.0f, 1.21f, 5.0f, 1.75f);
        r6.l(b, 1.25f, 7.5f, 12.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(9.43f, 5.0f, 7.5f, 5.0f);
        b.reflectiveCurveTo(4.0f, 6.57f, 4.0f, 8.5f);
        b.reflectiveCurveTo(5.57f, 12.0f, 7.5f, 12.0f);
        b.close();
        b.moveTo(7.5f, 6.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.close();
        b.moveTo(16.5f, 12.0f);
        b.curveToRelative(1.93f, 0.0f, 3.5f, -1.57f, 3.5f, -3.5f);
        b.reflectiveCurveTo(18.43f, 5.0f, 16.5f, 5.0f);
        b.reflectiveCurveTo(13.0f, 6.57f, 13.0f, 8.5f);
        b.reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f);
        b.close();
        b.moveTo(16.5f, 6.5f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(b, 0.9f, -2.0f, 2.0f, -2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _peopleOutline = build;
        build.getClass();
        return build;
    }
}
