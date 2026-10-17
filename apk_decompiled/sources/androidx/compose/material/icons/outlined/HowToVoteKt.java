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
import defpackage.af0;
import defpackage.fc;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HowToVoteKt {
    private static ImageVector _howToVote;

    public static final ImageVector getHowToVote(Icons.Outlined outlined) {
        ImageVector imageVector = _howToVote;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HowToVote", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        i.lineToRelative(-3.0f, 3.0f);
        i.verticalLineToRelative(4.0f);
        i.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        i.lineTo(19.0f, 22.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        uo.t(i, -4.0f, -3.0f, -3.0f);
        i.moveTo(19.0f, 20.0f);
        af0.m(i, 5.0f, 20.0f, -1.0f, 14.0f);
        r6.l(i, 1.0f, 11.34f, 15.02f);
        i.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        i.lineToRelative(6.36f, -6.36f);
        i.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        i.lineTo(14.16f, 2.3f);
        i.curveToRelative(-0.38f, -0.4f, -1.01f, -0.4f, -1.4f, -0.01f);
        i.lineTo(6.39f, 8.66f);
        i.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        fc.B(i, 4.95f, 4.95f, 13.46f, 4.41f);
        i.lineTo(17.0f, 7.95f);
        i.lineToRelative(-4.95f, 4.95f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(i, -3.54f, -3.54f, 4.95f, -4.95f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _howToVote = build;
        build.getClass();
        return build;
    }
}
