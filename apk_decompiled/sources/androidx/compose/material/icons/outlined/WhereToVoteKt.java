package androidx.compose.material.icons.outlined;

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

    public static final ImageVector getWhereToVote(Icons.Outlined outlined) {
        ImageVector imageVector = _whereToVote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WhereToVote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 1.0f);
        b.curveTo(7.59f, 1.0f, 4.0f, 4.59f, 4.0f, 9.0f);
        b.curveToRelative(0.0f, 5.57f, 6.96f, 13.34f, 7.26f, 13.67f);
        b.lineToRelative(0.74f, 0.82f);
        b.lineToRelative(0.74f, -0.82f);
        b.curveTo(13.04f, 22.34f, 20.0f, 14.57f, 20.0f, 9.0f);
        b.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        b.close();
        b.moveTo(12.0f, 20.47f);
        b.curveTo(9.82f, 17.86f, 6.0f, 12.54f, 6.0f, 9.0f);
        b.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b.reflectiveCurveToRelative(6.0f, 2.69f, 6.0f, 6.0f);
        b.curveToRelative(0.0f, 3.83f, -4.25f, 9.36f, -6.0f, 11.47f);
        k4.r(b, 10.47f, 11.17f, 8.71f, 9.4f);
        b.lineToRelative(-1.42f, 1.42f);
        b.lineTo(10.47f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 6.01f, -6.01f, -1.41f, -1.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whereToVote = build;
        build.getClass();
        return build;
    }
}
