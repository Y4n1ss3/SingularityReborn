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
import defpackage.gy;
import defpackage.j50;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditLocationAltKt {
    private static ImageVector _editLocationAlt;

    public static final ImageVector getEditLocationAlt(Icons.TwoTone twoTone) {
        ImageVector imageVector = _editLocationAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.EditLocationAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.9f, 9.05f);
        b.curveTo(17.96f, 9.41f, 18.0f, 9.79f, 18.0f, 10.2f);
        b.curveToRelative(0.0f, 1.71f, -1.08f, 4.64f, -6.0f, 9.14f);
        b.curveToRelative(-4.92f, -4.49f, -6.0f, -7.43f, -6.0f, -9.14f);
        b.curveTo(6.0f, 6.17f, 9.09f, 4.0f, 12.0f, 4.0f);
        b.curveToRelative(0.32f, 0.0f, 0.65f, 0.03f, 0.97f, 0.08f);
        b.lineToRelative(1.65f, -1.65f);
        b.curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f);
        b.curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f);
        b.curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f);
        b.curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f);
        b.curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f);
        uo.l(b, 17.9f, 9.05f, 20.71f, 2.0f);
        b.lineTo(20.0f, 1.29f);
        b.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        b.lineToRelative(-0.72f, 0.72f);
        b.lineToRelative(2.12f, 2.12f);
        b.lineToRelative(0.72f, -0.72f);
        b.curveTo(21.1f, 3.02f, 21.1f, 2.39f, 20.71f, 2.0f);
        af0.l(b, 11.0f, 11.0f, 2.12f);
        b.lineToRelative(6.16f, -6.16f);
        b.lineToRelative(-2.12f, -2.12f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.l(b, 11.0f, 8.88f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder c = gy.c(13.95f, 13.0f, 9.0f, 8.05f);
        c.lineToRelative(3.97f, -3.97f);
        c.curveTo(12.65f, 4.03f, 12.32f, 4.0f, 12.0f, 4.0f);
        c.curveToRelative(-2.91f, 0.0f, -6.0f, 2.17f, -6.0f, 6.2f);
        c.curveToRelative(0.0f, 1.71f, 1.08f, 4.64f, 6.0f, 9.14f);
        c.curveToRelative(4.92f, -4.49f, 6.0f, -7.43f, 6.0f, -9.14f);
        c.curveToRelative(0.0f, -0.4f, -0.04f, -0.78f, -0.1f, -1.15f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(c, 13.95f, 13.0f), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editLocationAlt = build;
        build.getClass();
        return build;
    }
}
