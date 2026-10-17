package androidx.compose.material3;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.DialogProperties;
import defpackage.dq;
import defpackage.iy;
import defpackage.my;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BasicAlertDialogOverrideScope {
    public static final int $stable = 0;
    private final my content;
    private final Modifier modifier;
    private final iy onDismissRequest;
    private final DialogProperties properties;

    public /* synthetic */ BasicAlertDialogOverrideScope(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar, int i, dq dqVar) {
        this(iyVar, (i & 2) != 0 ? Modifier.Companion : modifier, (i & 4) != 0 ? new DialogProperties(false, false, false, 7, (dq) null) : dialogProperties, myVar);
    }

    public final my getContent() {
        return this.content;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    public final iy getOnDismissRequest() {
        return this.onDismissRequest;
    }

    public final DialogProperties getProperties() {
        return this.properties;
    }

    public BasicAlertDialogOverrideScope(iy iyVar, Modifier modifier, DialogProperties dialogProperties, my myVar) {
        this.onDismissRequest = iyVar;
        this.modifier = modifier;
        this.properties = dialogProperties;
        this.content = myVar;
    }
}
