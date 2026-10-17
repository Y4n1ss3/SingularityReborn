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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WhereToVoteKt {
    private static ImageVector _whereToVote;

    public static final ImageVector getWhereToVote(Icons.TwoTone twoTone) {
        ImageVector imageVector = _whereToVote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.WhereToVote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 3.0f);
        b.curveTo(8.69f, 3.0f, 6.0f, 5.69f, 6.0f, 9.0f);
        b.curveToRelative(0.0f, 3.54f, 3.82f, 8.86f, 6.0f, 11.47f);
        b.curveToRelative(1.75f, -2.11f, 6.0f, -7.63f, 6.0f, -11.47f);
        b.curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f);
        k4.x(b, 10.47f, 14.0f, -3.18f, -3.18f);
        b.lineTo(8.71f, 9.4f);
        b.lineToRelative(1.77f, 1.77f);
        b.lineToRelative(4.6f, -4.6f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, 1.41f, 10.47f, 14.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 1.0f);
        b2.curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f);
        b2.curveToRelative(0.0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f);
        b2.lineToRelative(0.74f, 0.82f);
        b2.lineToRelative(0.74f, -0.82f);
        b2.curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f);
        b2.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        b2.close();
        b2.moveTo(12.0f, 20.47f);
        b2.curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f);
        b2.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b2.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b2.curveToRelative(0.0f, 3.83f, -4.25f, 9.36f, -6.0f, 11.47f);
        k4.x(b2, 15.07f, 6.57f, -4.6f, 4.6f);
        b2.lineTo(8.71f, 9.4f);
        b2.lineToRelative(-1.42f, 1.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(b2, 10.47f, 14.0f, 6.01f, -6.01f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whereToVote = build;
        build.getClass();
        return build;
    }
}
