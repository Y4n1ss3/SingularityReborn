package androidx.compose.material.icons.sharp;

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

    public static final ImageVector getWhereToVote(Icons.Sharp sharp) {
        ImageVector imageVector = _whereToVote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.WhereToVote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.14f, 2.0f, 5.0f, 5.14f, 5.0f, 9.0f);
        b.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        b.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        b.curveToRelative(0.0f, -3.86f, -3.14f, -7.0f, -7.0f, -7.0f);
        k4.x(b, 10.47f, 14.0f, -3.48f, -3.48f);
        b.lineTo(8.4f, 9.1f);
        b.lineToRelative(2.07f, 2.07f);
        b.lineToRelative(5.13f, -5.14f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.41f, 1.42f, 10.47f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _whereToVote = build;
        build.getClass();
        return build;
    }
}
