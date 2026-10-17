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
import defpackage.af0;
import defpackage.bv;
import defpackage.fc;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FamilyRestroomKt {
    private static ImageVector _familyRestroom;

    public static final ImageVector getFamilyRestroom(Icons.TwoTone twoTone) {
        ImageVector imageVector = _familyRestroom;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FamilyRestroom", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 4.0f);
        b.curveToRelative(0.0f, -1.11f, 0.89f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.89f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.89f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(16.0f, 5.11f, 16.0f, 4.0f);
        uo.C(b, 20.0f, 22.0f, -6.0f, 2.5f);
        b.lineToRelative(-2.54f, -7.63f);
        b.curveTo(19.68f, 7.55f, 18.92f, 7.0f, 18.06f, 7.0f);
        b.horizontalLineToRelative(-0.12f);
        b.curveToRelative(-0.86f, 0.0f, -1.63f, 0.55f, -1.9f, 1.37f);
        b.lineToRelative(-0.86f, 2.58f);
        b.curveTo(16.26f, 11.55f, 17.0f, 12.68f, 17.0f, 14.0f);
        kf0.n(b, 8.0f, 20.0f, 12.5f, 11.5f);
        b.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveTo(11.0f, 9.17f, 11.0f, 10.0f);
        b.reflectiveCurveTo(11.67f, 11.5f, 12.5f, 11.5f);
        b.close();
        b.moveTo(5.5f, 6.0f);
        b.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        b.reflectiveCurveTo(4.39f, 6.0f, 5.5f, 6.0f);
        af0.A(b, 7.5f, 22.0f, -7.0f, 9.0f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineTo(4.0f);
        b.curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f);
        fc.y(b, 6.0f, 1.5f, 7.0f, 7.5f);
        bv.y(b, 14.0f, 22.0f, -4.0f, 1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -0.82f, -0.68f, -1.5f, -1.5f, -1.5f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(-0.82f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(b, 4.0f, 1.0f, 4.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _familyRestroom = build;
        build.getClass();
        return build;
    }
}
