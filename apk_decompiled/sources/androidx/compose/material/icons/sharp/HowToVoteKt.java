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
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HowToVoteKt {
    private static ImageVector _howToVote;

    public static final ImageVector getHowToVote(Icons.Sharp sharp) {
        ImageVector imageVector = _howToVote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.HowToVote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(18.0f, 13.0f, -0.68f, -2.0f, 2.0f);
        i.horizontalLineToRelative(1.91f);
        i.lineTo(19.0f, 17.0f);
        i.lineTo(5.0f, 17.0f);
        i.lineToRelative(1.78f, -2.0f);
        i.horizontalLineToRelative(2.05f);
        i.lineToRelative(-2.0f, -2.0f);
        i.lineTo(6.0f, 13.0f);
        r6.A(i, -3.0f, 3.0f, 6.0f, 18.0f);
        r6.l(i, -6.0f, 19.81f, 7.96f);
        i.lineTo(13.45f, 1.6f);
        i.lineTo(5.68f, 9.36f);
        fc.C(i, 6.36f, 6.36f, 7.77f, -7.76f);
        i.moveTo(13.46f, 4.41f);
        i.lineTo(17.0f, 7.95f);
        i.lineToRelative(-4.95f, 4.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -3.54f, -3.54f, 4.95f, -4.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _howToVote = build;
        build.getClass();
        return build;
    }
}
