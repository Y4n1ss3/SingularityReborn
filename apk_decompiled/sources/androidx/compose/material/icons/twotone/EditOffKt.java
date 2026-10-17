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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditOffKt {
    private static ImageVector _editOff;

    public static final ImageVector getEditOff(Icons.TwoTone twoTone) {
        ImageVector imageVector = _editOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = fc.c(5.0f, 18.08f, 19.0f, 0.92f);
        c.lineToRelative(5.12f, -5.12f);
        gy.B(c, -0.92f, -0.92f, 5.0f, 18.08f);
        c.moveTo(14.06f, 9.02f);
        c.lineToRelative(-1.11f, 1.11f);
        c.lineToRelative(0.92f, 0.92f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(c, 1.11f, -1.11f, 14.06f, 9.02f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.06f, 9.02f, 0.92f, 0.92f);
        e.lineToRelative(-1.11f, 1.11f);
        e.lineToRelative(1.41f, 1.41f);
        e.lineToRelative(2.52f, -2.52f);
        e.lineToRelative(-3.75f, -3.75f);
        e.lineToRelative(-2.52f, 2.52f);
        gy.B(e, 1.41f, 1.41f, 14.06f, 9.02f);
        e.moveTo(20.71f, 7.04f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(-2.34f, -2.34f);
        e.curveTo(18.17f, 3.09f, 17.92f, 3.0f, 17.66f, 3.0f);
        e.reflectiveCurveToRelative(-0.51f, 0.1f, -0.7f, 0.29f);
        e.lineToRelative(-1.83f, 1.83f);
        gy.B(e, 3.75f, 3.75f, 20.71f, 7.04f);
        e.moveTo(2.81f, 2.81f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(7.32f, 7.32f);
        fc.t(e, 3.0f, 17.25f, 21.0f, 3.75f);
        e.lineToRelative(5.71f, -5.71f);
        e.lineToRelative(7.32f, 7.32f);
        gy.B(e, 1.41f, -1.41f, 2.81f, 2.81f);
        k4.A(e, 5.92f, 19.0f, 5.0f, -0.92f);
        e.lineToRelative(5.13f, -5.13f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, 0.92f, 0.92f, 5.92f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editOff = build;
        build.getClass();
        return build;
    }
}
