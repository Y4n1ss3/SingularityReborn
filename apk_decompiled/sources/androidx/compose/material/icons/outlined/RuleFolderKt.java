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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RuleFolderKt {
    private static ImageVector _ruleFolder;

    public static final ImageVector getRuleFolder(Icons.Outlined outlined) {
        ImageVector imageVector = _ruleFolder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.RuleFolder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.83f, 16.0f, 5.0f, 13.17f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(3.54f, -3.54f);
        gy.B(i, 1.41f, 1.41f, 7.83f, 16.0f);
        i.moveTo(17.41f, 13.0f);
        i.lineTo(19.0f, 14.59f);
        i.lineTo(17.59f, 16.0f);
        i.lineTo(16.0f, 14.41f);
        i.lineTo(14.41f, 16.0f);
        i.lineTo(13.0f, 14.59f);
        i.lineTo(14.59f, 13.0f);
        i.lineTo(13.0f, 11.41f);
        i.lineTo(14.41f, 10.0f);
        i.lineTo(16.0f, 11.59f);
        i.lineTo(17.59f, 10.0f);
        r6.C(i, 19.0f, 11.41f, 17.41f, 13.0f);
        i.moveTo(20.0f, 6.0f);
        r6.t(i, -8.0f, -2.0f, -2.0f, 4.0f);
        i.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        i.lineTo(2.0f, 18.0f);
        i.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        i.horizontalLineToRelative(16.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.verticalLineTo(8.0f);
        i.curveTo(22.0f, 6.9f, 21.1f, 6.0f, 20.0f, 6.0f);
        k4.r(i, 20.0f, 18.0f, 4.0f, 18.0f);
        uo.u(i, 6.0f, 5.17f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(i, 20.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _ruleFolder = build;
        build.getClass();
        return build;
    }
}
