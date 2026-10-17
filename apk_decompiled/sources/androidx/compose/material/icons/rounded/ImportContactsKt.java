package androidx.compose.material.icons.rounded;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ImportContactsKt {
    private static ImageVector _importContacts;

    public static final ImageVector getImportContacts(Icons.Rounded rounded) {
        ImageVector imageVector = _importContacts;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ImportContacts", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(17.5f, 4.5f);
        b.curveToRelative(-1.95f, 0.0f, -4.05f, 0.4f, -5.5f, 1.5f);
        b.curveToRelative(-1.45f, -1.1f, -3.55f, -1.5f, -5.5f, -1.5f);
        b.curveToRelative(-1.45f, 0.0f, -2.99f, 0.22f, -4.28f, 0.79f);
        b.curveTo(1.49f, 5.62f, 1.0f, 6.33f, 1.0f, 7.14f);
        b.verticalLineToRelative(11.28f);
        b.curveToRelative(0.0f, 1.3f, 1.22f, 2.26f, 2.48f, 1.94f);
        b.curveToRelative(0.98f, -0.25f, 2.02f, -0.36f, 3.02f, -0.36f);
        b.curveToRelative(1.56f, 0.0f, 3.22f, 0.26f, 4.56f, 0.92f);
        b.curveToRelative(0.6f, 0.3f, 1.28f, 0.3f, 1.87f, 0.0f);
        b.curveToRelative(1.34f, -0.67f, 3.0f, -0.92f, 4.56f, -0.92f);
        b.curveToRelative(1.0f, 0.0f, 2.04f, 0.11f, 3.02f, 0.36f);
        b.curveToRelative(1.26f, 0.33f, 2.48f, -0.63f, 2.48f, -1.94f);
        b.verticalLineTo(7.14f);
        b.curveToRelative(0.0f, -0.81f, -0.49f, -1.52f, -1.22f, -1.85f);
        b.curveToRelative(-1.28f, -0.57f, -2.82f, -0.79f, -4.27f, -0.79f);
        b.close();
        b.moveTo(21.0f, 17.23f);
        b.curveToRelative(0.0f, 0.63f, -0.58f, 1.09f, -1.2f, 0.98f);
        b.curveToRelative(-0.75f, -0.14f, -1.53f, -0.2f, -2.3f, -0.2f);
        b.curveToRelative(-1.7f, 0.0f, -4.15f, 0.65f, -5.5f, 1.5f);
        b.verticalLineTo(8.0f);
        b.curveToRelative(1.35f, -0.85f, 3.8f, -1.5f, 5.5f, -1.5f);
        b.curveToRelative(0.92f, 0.0f, 1.83f, 0.09f, 2.7f, 0.28f);
        b.curveToRelative(0.46f, 0.1f, 0.8f, 0.51f, 0.8f, 0.98f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, 9.47f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _importContacts = build;
        build.getClass();
        return build;
    }
}
